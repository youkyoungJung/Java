//20181013������
import java.util.*;
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		int cnt = 0;
		double average = 0;
		do
		{
			System.out.print("���ڸ� �Է��ϼ���: ");
			num = input.nextInt();
			if(num > 0)
			{
				sum += num;
				cnt++;
			}
			if(num < 0)
			{
				System.out.println("������ �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���.");
			}	
			average = (double)sum / cnt;
		}while(num != 0);
		
		System.out.println("�Էµ� ���ڵ��� ���� " + sum + "�Դϴ�.");
		System.out.println("�Էµ� ���ڵ� �߿��� 0 ���� ū ������ ������ " + cnt + "�Դϴ�.");
		System.out.println("�Էµ� ���ڵ��� ����� " + average + "�Դϴ�.");
	}

}
