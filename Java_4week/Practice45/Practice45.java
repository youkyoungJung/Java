//20181013������
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
		System.out.print("�л� ���ڸ� �Է��ϼ��� : ");
		num = sc.nextInt();
		
		for(i = 0; i < 4; i++)
		{
			System.out.println((i + 1) + "�� �л��� ����");
			System.out.print("�̸� : ");
			s[i].setName(sc.next());
			System.out.print("�й�  : ");
			s[i].setSid(sc.nextLong());
			System.out.print("���� : ");
			s[i].setMajor(sc.next());
			System.out.println();
		}
		System.out.println("�Էµ� �л��� �����Դϴ�.");
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
					System.out.println("\""+s[0].getName()+"\" �л��� \""+ s[i].getName()+ "\"�л��� ������ ����, �й��� �����ϴ�.");
				else if(s[0].isSenior(s[i]) == 0)
					System.out.println("\""+s[0].getName()+"\" �л��� \""+ s[i].getName()+ "\"�л��� ������ ����, �й��� �����ϴ�.");
				else
					System.out.println("\""+s[0].getName()+"\" �л��� \""+ s[i].getName()+ "\"�л��������� ����, �й��� �����ϴ�.");
			}
			else
			{
				if(s[0].isSenior(s[i]) == -1)
					System.out.println("\""+s[0].getName()+"\" �л��� \""+ s[i].getName()+ "\"�л��� ������ �ٸ���, �й��� �����ϴ�.");
				else if(s[0].isSenior(s[i]) == 0)
					System.out.println("\""+s[0].getName()+"\" �л��� \""+ s[i].getName()+ "\"�л��� ������ �ٸ���, �й��� �����ϴ�.");
				else
					System.out.println("\""+s[0].getName()+"\" �л��� \""+ s[i].getName()+ "\"�л��� ������ �ٸ���, �й��� �����ϴ�.");
			}
		}
	}

}
