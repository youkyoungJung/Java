//20181013정유경
public class Practice44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Student[] s = new Student[3];

		for(i = 0; i < s.length; i++)
		{
			s[i] = new Student();
		}
		s[0].setName("홍길동");
		s[0].setSid(20111234L);
		s[0].setMajor("컴퓨터학");

		s[1].setName("성춘향");
		s[1].setSid(20121357L);
		s[1].setMajor("국문학");

		s[2].setName("이몽룡");
		s[2].setSid(20101357L);
		s[2].setMajor("컴퓨터학");


		for(i = 0; i < s.length; i++)
		{
			System.out.println((i + 1) + "번 학생의 정보");
			System.out.println(s[i].printSafely());
		}
		System.out.println();
		
		for(i = 1; i < s.length; i++)
		{
			if(s[0].equalsMajor(s[i]) == true)
			{
				if(s[0].isSenior(s[i]) == -1)
					System.out.println("\""+s[0].getName()+"\" 학생은 \""+ s[i].getName()+ "\"학생과 전공은 같고, 학번은 빠릅니다.");
				else if(s[0].isSenior(s[i]) == 0)
					System.out.println("\""+s[0].getName()+"\" 학생은 \""+ s[i].getName()+ "\"학생과 전공은 같고, 학번은 같습니다.");
				else
					System.out.println("\""+s[0].getName()+"\" 학생은 \""+ s[i].getName()+ "\"학생과전공은 같고, 학번은 느립니다.");
			}
			else
			{
				if(s[0].isSenior(s[i]) == -1)
					System.out.println("\""+s[0].getName()+"\" 학생은 \""+ s[i].getName()+ "\"학생과 전공은 다르고, 학번은 빠릅니다.");
				else if(s[0].isSenior(s[i]) == 0)
					System.out.println("\""+s[0].getName()+"\" 학생은 \""+ s[i].getName()+ "\"학생과 전공은 다르고, 학번은 같습니다.");
				else
					System.out.println("\""+s[0].getName()+"\" 학생은 \""+ s[i].getName()+ "\"학생과 전공은 다르고, 학번은 느립니다.");
			}
		}

	}

}
