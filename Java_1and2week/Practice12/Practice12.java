//20181013������
import java.util.*;
public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		int cnt = 0;
		
		do
		{
			System.out.print("������ �Է��ϼ��� : ");
			num = sc.nextInt();
	
			if(num < 0 )
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
		}while(num < 0);
		
		for(i = 1; i <= num; i++)
		{
			if(i % 5 != 0)
			{
					cnt++;
					System.out.print(i + " ");
					if(cnt % 7 == 0)
						System.out.println();
			}
		}
	
	}

}
