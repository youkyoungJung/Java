//20181013정유경
import java.util.*;
public class Practice62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num1;
		String num2;
		int num3 = 0, num4 = 0;
		boolean isDone = false;
		int result = 0;

		while(isDone != true) {
			try {
				System.out.print("1번 피연산자를 입력하세요: ");
				num1 = sc.next();
				num3 = Integer.parseInt(num1);
				
			}catch(NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				continue;
			}isDone = true;
		}
		isDone = false;
		while(isDone != true) {
			try {
				System.out.print("2번 피연산자를 입력하세요: ");
				num2 = sc.next();
				num4 = Integer.parseInt(num2);
				isDone = true;
			}catch(NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				continue;
			}
		isDone = true;
		}
	
		result = num3 + num4;
		System.out.println(num3 + "+" + num4 + " = " + result);
	}

}
