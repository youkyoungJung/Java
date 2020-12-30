//20181013Á¤À¯°æ
public class Practice53A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s = new Student[3];
		s[0] = new Student();
		s[0].setId(1111);
		s[0].setTuition(100);
		s[0].setGpa(3.2);
		
		s[1] = new UndergraduateStudent();
		((UndergraduateStudent) s[1]).setYear(3);
		s[1].setId(2222);
		s[1].setTuition(100);
		s[1].setGpa(4.1);
		
		s[2] = new GraduateStudent();
		((GraduateStudent)s[2]).setLab("SE");
		s[2].setId(3333);
		s[2].setTuition(100);
		s[2].setGpa(3.4);

		printAll(s);

	}
	public static void printAll(Student[] s)
	{
		int i;
		for(i = 0; i < s.length; i++) 
		{
			System.out.println(s[i].toString());
		}
	}
}
