//20181013정유경 
import java.util.*;
public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String name1,name2;

		System.out.print("철수의 입력: ");
		name1 = sc.nextLine();
		System.out.print("영희의 입력: ");
		name2 = sc.nextLine();

		if(name1.equals("가위")) {
			if(name2.equals("가위"))
				System.out.println("비겼습니다.");
			else if(name2.equals("바위"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		}
		if(name1.equals("바위")) {
			if(name2.equals("바위"))
				System.out.println("비겼습니다.");
			else if(name2.equals("보"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		}
		if(name1.equals("보")) {
			if(name2.equals("보"))
				System.out.println("비겼습니다.");
			else if(name2.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		}
	}
}
