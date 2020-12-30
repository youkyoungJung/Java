//20181013정유경
import java.util.Scanner;
public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int com;
		String rcp, comg;
		int d = 0, yw = 0, cw = 0;

		while(true)
		{
			System.out.println("현재 당신의 전적: " + yw + "승 " + cw + "패 " + d + "무");
			com = (int)(Math.random() * 3);
			if (com == 0)
				rcp = "가위";
			else if(com == 1)
				rcp = "바위";
			else
				rcp = "보";
			System.out.println("컴퓨터의 입력: " + rcp);

			System.out.print("당신의 입력(가위/바위/보/그만): ");
			comg = sc.next();
			if(comg.equals("그만"))
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			if (whoswin(rcp, comg) == -1)
			{
				System.out.println("컴퓨터가 이겼습니다.");
				cw++;
			}
			else if(whoswin(rcp, comg) == 0)
			{
				System.out.println("비겼습니다.");
				d++;
			}
			else if(whoswin(rcp, comg) == 1)
			{
				System.out.println("당신이 이겼습니다.");
				yw++;
			}
			
		}
	}
	public static int whoswin(String com, String you)
	{
		if(com.equals("가위"))
		{
			if(you.equals("가위"))
				return 0;
			else if(you.equals("보"))
				return -1;
			else if(you.equals("바위"))
				return 1;
		}
		if(com.equals("바위"))
		{
			if(you.equals("가위"))
				return -1;
			else if(you.equals("보"))
				return 1;
			else if(you.equals("바위"))
				return 0;
		}
		if(com.equals("보"))
		{
			if(you.equals("가위"))
				return 1;
			else if(you.equals("보"))
				return 0;
			else if(you.equals("바위"))
				return -1;
		}
		return 0;
	}

}
