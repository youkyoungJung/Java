import java.util.*;
public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int num = input.nextInt();
		System.out.print("�Է��� ���� "+ num);
		
		if(num < 0)
		{
			num = num * (-1);	
			System.out.println("�� ���밪�� " + num + "�Դϴ�.");
		}
		else
			System.out.print("�� ���밪�� " + num + "�Դϴ�.");
	}

}
