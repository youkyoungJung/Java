import java.util.*;
public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		do
		{
			System.out.print("���ڸ� �Է��ϼ���: ");
			num = input.nextInt();
			if(num > 0)
				sum += num;
			
			else
			{
				System.out.println("������ �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���.");
			}	
			
		}while(num != 0);
		
		System.out.println("�Էµ� ���ڵ��� ���� " + sum + "�Դϴ�.");
	}
}
