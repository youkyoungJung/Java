//20181013������
public class Practice44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Student[] s = new Student[3];

		for(i = 0; i < s.length; i++)
		{
			s[i] = new Student();
		}
		s[0].setName("ȫ�浿");
		s[0].setSid(20111234L);
		s[0].setMajor("��ǻ����");

		s[1].setName("������");
		s[1].setSid(20121357L);
		s[1].setMajor("������");

		s[2].setName("�̸���");
		s[2].setSid(20101357L);
		s[2].setMajor("��ǻ����");


		for(i = 0; i < s.length; i++)
		{
			System.out.println((i + 1) + "�� �л��� ����");
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
