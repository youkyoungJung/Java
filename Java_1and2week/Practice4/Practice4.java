import java.util.*;
public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int num = input.nextInt();
		
		if(num >= 0)
		{
			if(num % 2 == 0)
				System.out.println("�Է��� ����" + num + "�� ¦�� �Դϴ�.");
			else
				System.out.println("�Է��� ����" + num +"�� Ȧ�� �Դϴ�.");
		}
		else
		System.out.println("�Է��� ���� "+ num + "�� �����Դϴ�.");
	}

}
