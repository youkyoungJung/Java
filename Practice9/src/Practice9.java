import java.util.*;
public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		do
		{
			System.out.print("숫자를 입력하세요: ");
			num = input.nextInt();
			if(num > 0)
				sum += num;
			
			else
			{
				System.out.println("음수가 입력되었습니다. 다시 입력하세요.");
			}	
			
		}while(num != 0);
		
		System.out.println("입력된 숫자들의 합은 " + sum + "입니다.");
	}
}
