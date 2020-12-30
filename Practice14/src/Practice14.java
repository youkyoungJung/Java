//20181013 정유경
import java.util.*;
import java.util.Random;
public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String rcp;
		int com;
		String comg;
		System.out.print("컴퓨터의 생성: ");
		com = (int) (Math.random() * 3) + 1;
		if(com == 1)
			comg = "바위";
		else if(com == 2)
			comg = "가위";
		else
			comg = "보";

		System.out.println(comg);

		System.out.print("당신의 입력: ");  
		rcp = sc.nextLine();

		if(comg.equals("가위")) {
			if(rcp.equals("가위"))
				System.out.println("비겼습니다.");
			else if(rcp.equals("바위"))
				System.out.println("당신이 이겼습니다.");
			else
				System.out.println("컴퓨터가 이겼습니다.");
		}
		if(comg.equals("바위")) {
			if(rcp.equals("바위"))
				System.out.println("비겼습니다.");
			else if(rcp.equals("보"))
				System.out.println("당신이 이겼습니다.");
			else
				System.out.println("컴퓨터가 이겼습니다.");
		}
		if(comg.equals("보")) {
			if(rcp.equals("보"))
				System.out.println("비겼습니다.");
			else if(rcp.equals("가위"))
				System.out.println("당신이 이겼습니다.");
			else
				System.out.println("컴퓨터가 이겼습니다.");
		}
	}
}
