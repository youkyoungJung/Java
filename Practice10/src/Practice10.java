//20181013정유경
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
			System.out.print("숫자를 입력하세요: ");
			num = input.nextInt();
			if(num > 0)
			{
				sum += num;
				cnt++;
			}
			if(num < 0)
			{
				System.out.println("음수가 입력되었습니다. 다시 입력하세요.");
			}	
			average = (double)sum / cnt;
		}while(num != 0);
		
		System.out.println("입력된 숫자들의 합은 " + sum + "입니다.");
		System.out.println("입력된 숫자들 중에서 0 보다 큰 숫자의 개수는 " + cnt + "입니다.");
		System.out.println("입력된 숫자들의 평균은 " + average + "입니다.");
	}

}
