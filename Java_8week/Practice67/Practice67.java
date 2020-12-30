//20181013정유경
import java.util.*;
public class Practice67 {
	public static String getInput(Scanner s) throws InvalidInputException
	{
		Scanner sc = new Scanner(System.in);
		String user;

		System.out.print("당신의 입력: ");
		user = sc.nextLine();
		if(user.equals("가위")||user.equals("바위")||user.equals("보"))
			return user;
		else
			throw new InvalidInputException();
	}
	public static String getValidInput()
	{
		String r = null;
		while(true) {

			try
			{
				r = getInput(null);
				break;
			}
			catch(InvalidInputException e){
				e.printStackTrace();
				continue;
			}
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int com;
		String c;

		com = (int)(Math.random() * 3);
		if(com == 0)
			c =  "가위";
		else if(com == 1)
			c = "바위";
		else
			c = "보";

		System.out.println("컴퓨터의 생성 : " + c);

		try {
			input = getValidInput();
			if(whoswin(c, input) == 1)
				System.out.println("당신이 이겼습니다");
			else if(whoswin(c, input) == -1)
				System.out.println("당신이 졌습니다.");
			else if(whoswin(c, input) == 0)
				System.out.println("비겼습니다.");
			return;
		}catch(InvalidInputException e){
			e.printStackTrace();
		}
	}
	public static int whoswin(String com, String input) throws InvalidInputException
	{
		String a = "가위";
		String b = "바위";
		String c = "보";

		if(com.equals(input))
			return 0;
		else if(com.equals(a) && input.equals(b))
			return 1;
		else if(com.equals(b) && input.equals(c))
			return 1;
		else if(com.equals(c) && input.equals(a))
			return 1;
		return -1;
	}

}
