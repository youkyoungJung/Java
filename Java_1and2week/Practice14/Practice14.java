//20181013 ������
import java.util.*;
import java.util.Random;
public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String rcp;
		int com;
		String comg;
		System.out.print("��ǻ���� ����: ");
		com = (int) (Math.random() * 3) + 1;
		if(com == 1)
			comg = "����";
		else if(com == 2)
			comg = "����";
		else
			comg = "��";

		System.out.println(comg);

		System.out.print("����� �Է�: ");  
		rcp = sc.nextLine();

		if(comg.equals("����")) {
			if(rcp.equals("����"))
				System.out.println("�����ϴ�.");
			else if(rcp.equals("����"))
				System.out.println("����� �̰���ϴ�.");
			else
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		if(comg.equals("����")) {
			if(rcp.equals("����"))
				System.out.println("�����ϴ�.");
			else if(rcp.equals("��"))
				System.out.println("����� �̰���ϴ�.");
			else
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		if(comg.equals("��")) {
			if(rcp.equals("��"))
				System.out.println("�����ϴ�.");
			else if(rcp.equals("����"))
				System.out.println("����� �̰���ϴ�.");
			else
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
	}
}
