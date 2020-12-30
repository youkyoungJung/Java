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
   public T select() throws ImproperArraySizeException{
	   ArrayList<T> tmp = copyArray();
      
		if(list == null || list.size() == 0)
			throw new ImproperArraySizeException();
		Collections.shuffle(tmp);
      
      return tmp.get(0);
   }
   public void print() {
      int i;
      
      for (i = 0; i < list.size(); i++) {
         System.out.print(list.get(i) + "\t");
      }
   }

   private ArrayList<T>copyArray(){
	ArrayList<T> tmp = new ArrayList<T>();
	
	tmp.addAll(list);
	
	return tmp;
   }
}