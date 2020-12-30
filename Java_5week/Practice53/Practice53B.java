//20181013Á¤À¯°æ
public class Practice53B {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      int i;
      Student s1 = new Student(1111, 100, 3.2);
      Student u = new UndergraduateStudent(2222, 100, 4.1, 3);
      Student g = new GraduateStudent(3333, 100, 3.4, "SE");

      Student[] s = new Student[3];

      s[0] = s1;
      s[1] = u;
      s[2] = g;

      printAll(s);
   }
   public static void printAll(Student[] s) {

      for (int i = 0; i < s.length; i++) {
         System.out.println(s[i].toString());
      }

   }

}

