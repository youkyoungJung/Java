import java.util.*;
public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = input.nextInt();
		
		if(num >= 0)
		{
			if(num % 2 == 0)
				System.out.println("입력한 정수" + num + "은 짝수 입니다.");
			else
				System.out.println("입력한 정수" + num +"은 홀수 입니다.");
		}
		else
		System.out.println("입력한 정수 "+ num + "은 음수입니다.");
	}

}
