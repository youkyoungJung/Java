//20181013Á¤À¯°æ
import java.util.*;
public class RandomList<T> {
   ArrayList<T> list;

   public RandomList() {
      list = new ArrayList<T>();
   }
   public void add(T item) {
      list.add(item);
   }
   public T select() {
      int i = (int)(Math.random() * list.size());
      
      return list.get(i);
   }
   public void print() {
      int i;
      
      for (i = 0; i < list.size(); i++) {
         System.out.print(list.get(i) + "\t");
      }
   }
}
