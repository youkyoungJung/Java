//20181013������
import java.util.*;
public class Practice66 {
	public static String getInput(Scanner s) throws InvalidInputException
	{
		Scanner sc = new Scanner(System.in);
		String user;

		System.out.print("����� �Է�: ");
		user = sc.nextLine();
		if(user.equals("����")||user.equals("����")||user.equals("��"))
			return user;
		else
			throw new InvalidInputException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;

		int com;
		String c;

		com = (int)(Math.random() * 3);
		if(com == 0)
			c =  "����";
		else if(com == 1)
			c = "����";
		else
			c = "��";

		System.out.println("��ǻ���� ���� : " + c);

		try {
			input = getInput(null);
			if(whoswin(c, input) == 1)
				System.out.println("����� �̰���ϴ�");
			else if(whoswin(c, input) == -1)
				System.out.println("����� �����ϴ�.");
			else if(whoswin(c, input) == 0)
				System.out.println("�����ϴ�.");
			return;
		}catch(InvalidInputException e){
			e.printStackTrace();
		}

	}
	public static int whoswin(String com, String input) throws InvalidInputException
	{
		String a = "����";
		String b = "����";
		String c = "��";

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
