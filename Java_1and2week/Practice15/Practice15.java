//20181013 정유경
import java.util.*;
public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String rcp;
		int com;
		String comg;
		System.out.print("컴퓨터의 생성: ");
		com = (int) (Math.random() * 3) - 1;
		if(com == -1)
			comg = "바위";
		else if(com == 0)
			comg = "가위";
		else
			comg = "보";

		System.out.println(comg);

		System.out.print("당신의 입력: ");  
		rcp = sc.nextLine();
		if(whoswin(comg, rcp) == 1)
			System.out.println("당신이 이겼습니다");
		else if(whoswin(comg, rcp) == -1)
			System.out.println("당신이 졌습니다.");
		else if(whoswin(comg, rcp) == 0)
			System.out.println("비겼습니다.");

	}
	public static int whoswin(String comg, String you)
	{
		if(comg.equals("가위")) {
			if(you.equals("가위"))
				return 0;
			else if(you.equals("바위"))
				return 1;
			else
				return -1;
		}
		if(comg.equals("바위")) {
			if(you.equals("바위"))
				return 0;
			else if(you.equals("보"))
				return 1;
			else
				return -1;
		}
		if(comg.equals("보")) {
			if(you.equals("보"))
				return 0;
			else if(you.equals("가위"))
				return 1;
			else
				return -1;
		}
		return 0;

	}
}
