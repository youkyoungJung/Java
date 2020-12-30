//20181013정유경
import java.util.*;
public class Practice33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int w1, w2, h1, h2;
		System.out.print("사각형1의 가로를 입력: ");
		w1 = sc.nextInt();
		System.out.print("사각형1의 세로를 입력: ");
		h1 = sc.nextInt();
		Square s1 = Square.getInstance(w1, h1);
		
		System.out.print("사각형2의 가로를 입력: ");
		w2 = sc.nextInt();
		System.out.print("사각형2의 세로를 입력: ");
		h2 = sc.nextInt();
		Square s2 = Square.getInstance(w2, h2);
		
		if(s1.isSmallerThan(s2) == true)
			System.out.println("사각형1의 넓이가 더 작습니다");
		else if(s2.isSmallerThan(s1) == true)
			System.out.println("사각형2의 넓이가 더 작습니다");
		else
			System.out.println("두 사각형의 넓이가 같습니다.");
	}


}