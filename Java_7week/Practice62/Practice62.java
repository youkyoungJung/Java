//20181013������
import java.util.*;
public class Practice62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num1;
		String num2;
		int num3 = 0, num4 = 0;
		boolean isDone = false;
		int result = 0;

		while(isDone != true) {
			try {
				System.out.print("1�� �ǿ����ڸ� �Է��ϼ���: ");
				num1 = sc.next();
				num3 = Integer.parseInt(num1);
				
			}catch(NumberFormatException e) {
				System.out.println("�߸��� ������ �����Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}isDone = true;
		}
		isDone = false;
		while(isDone != true) {
			try {
				System.out.print("2�� �ǿ����ڸ� �Է��ϼ���: ");
				num2 = sc.next();
				num4 = Integer.parseInt(num2);
				isDone = true;
			}catch(NumberFormatException e) {
				System.out.println("�߸��� ������ �����Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
		isDone = true;
		}
	
		result = num3 + num4;
		System.out.println(num3 + "+" + num4 + " = " + result);
	}

}
