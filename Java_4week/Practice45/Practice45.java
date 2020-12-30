//20181013정유경
import java.util.*;
public class Practice45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		
		Student[] s = new Student[4];
		
		for(i = 0; i < 4; i++)
		{
			s[i] = new Student();
		}
		System.out.print("학생 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(i = 0; i < 4; i++)
		{
			System.out.println((i + 1) + "번 학생의 정보");
			System.out.print("이름 : ");
			s[i].setName(sc.next());
			System.out.print("학번  : ");
			s[i].setSid(sc.nextLong());
			System.out.print("전공 : ");
			s[i].setMajor(sc.next());
			System.out.println();
		}
		System.out.println("입력된 학생의 정보입니다.");
		for(i = 0; i < s.length; i++)
		{
			System.out.print("[" + (i + 1) + "] ");
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
