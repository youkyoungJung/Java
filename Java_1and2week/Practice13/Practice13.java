//20181013������ 
import java.util.*;
public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String name1,name2;

		System.out.print("ö���� �Է�: ");
		name1 = sc.nextLine();
		System.out.print("������ �Է�: ");
		name2 = sc.nextLine();

		if(name1.equals("����")) {
			if(name2.equals("����"))
				System.out.println("�����ϴ�.");
			else if(name2.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		}
		if(name1.equals("����")) {
			if(name2.equals("����"))
				System.out.println("�����ϴ�.");
			else if(name2.equals("��"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		}
		if(name1.equals("��")) {
			if(name2.equals("��"))
				System.out.println("�����ϴ�.");
			else if(name2.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		}
	}
}
