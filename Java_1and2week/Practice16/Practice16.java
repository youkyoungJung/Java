//20181013������
import java.util.Scanner;
public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int com;
		String rcp, comg;
		int d = 0, yw = 0, cw = 0;

		while(true)
		{
			System.out.println("���� ����� ����: " + yw + "�� " + cw + "�� " + d + "��");
			com = (int)(Math.random() * 3);
			if (com == 0)
				rcp = "����";
			else if(com == 1)
				rcp = "����";
			else
				rcp = "��";
			System.out.println("��ǻ���� �Է�: " + rcp);

			System.out.print("����� �Է�(����/����/��/�׸�): ");
			comg = sc.next();
			if(comg.equals("�׸�"))
			{
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

			if (whoswin(rcp, comg) == -1)
			{
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				cw++;
			}
			else if(whoswin(rcp, comg) == 0)
			{
				System.out.println("�����ϴ�.");
				d++;
			}
			else if(whoswin(rcp, comg) == 1)
			{
				System.out.println("����� �̰���ϴ�.");
				yw++;
			}
			
		}
	}
	public static int whoswin(String com, String you)
	{
		if(com.equals("����"))
		{
			if(you.equals("����"))
				return 0;
			else if(you.equals("��"))
				return -1;
			else if(you.equals("����"))
				return 1;
		}
		if(com.equals("����"))
		{
			if(you.equals("����"))
				return -1;
			else if(you.equals("��"))
				return 1;
			else if(you.equals("����"))
				return 0;
		}
		if(com.equals("��"))
		{
			if(you.equals("����"))
				return 1;
			else if(you.equals("��"))
				return 0;
			else if(you.equals("����"))
				return -1;
		}
		return 0;
	}

}
