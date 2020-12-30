//20181013정유경
import java.util.*;
public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		
		do
		{
			System.out.print("숫자를 입력하세요: ");
			num = sc.nextInt();
			
			for(i = 2; i <= num; i++)
			{
				if(num % i == 0)
				{
					System.out.println("입력된 숫자 "+ num + "은 소수 아닙니다");
					break;
				}
				else
				{
					System.out.println("입력된 숫자 "+ num + "은 소수 입니다");
					break;
				}
			}
			if(num < 0 )
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		
		}while(num < 1);
	}

}
