import java.util.*;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하세요: ");
		int f= input.nextInt();
		double c;
		c = (5 /(double) 9) * (f - 32);
		System.out.println("해당하는 섭씨 온도는 "+ c + "입니다.");
	}

}

