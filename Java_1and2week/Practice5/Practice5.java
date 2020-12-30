import java.util.*;
public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = input.nextInt();
		System.out.print("입력한 정수 "+ num);
		
		if(num < 0)
		{
			num = num * (-1);	
			System.out.println("의 절대값은 " + num + "입니다.");
		}
		else
			System.out.print("의 절대값은 " + num + "입니다.");
	}

}
