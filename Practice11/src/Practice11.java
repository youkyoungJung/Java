//20181013������
import java.util.*;
public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		
		do
		{
			System.out.print("���ڸ� �Է��ϼ���: ");
			num = sc.nextInt();
			
			for(i = 2; i <= num; i++)
			{
				if(num % i == 0)
				{
					System.out.println("�Էµ� ���� "+ num + "�� �Ҽ� �ƴմϴ�");
					break;
				}
				else
				{
					System.out.println("�Էµ� ���� "+ num + "�� �Ҽ� �Դϴ�");
					break;
				}
			}
			if(num < 0 )
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
		
		}while(num < 1);
	}

}
