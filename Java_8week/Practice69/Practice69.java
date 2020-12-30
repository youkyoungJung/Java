//20181013������
import java.util.*;
public class Practice69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money, num2 = 0;
		int num = 1;
		
		BankAccount[] b = new BankAccount[3];
		Scanner sc = new Scanner(System.in);

		getAcclnfo(sc, b);
		while(num != 0)
		{
			try {
				printAccInfo(b);
				num = getAccNum(sc);
				if(num == 0) 
				{
					System.out.println("���α׷��� �����մϴ�");
					return;
				}
				if(num <= 3) {
					num2 = getOperationNum(sc);	
					if(num2 == 1)
					{
						System.out.print("�Աݾ��� �Է��ϼ���: ");
						money = sc.nextInt();
						b[num -1].deposit(money);
						System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
					}

					else if(num2 == 2)
					{
						System.out.print("��ݾ��� �Է��ϼ���: ");
						money = sc.nextInt(); 
						b[num - 1].withdraw(money);
						System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					} 
				}

			}catch(NoSuchOperationException e)
			{
				e.printStackTrace();
				continue;
			}
			catch (NoSuchAccountException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				continue;
			}
			catch (NegativeBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				continue;
			}	
			
	
		}
	}
	private static void getAcclnfo(Scanner scan, BankAccount[] ba)//����ڿ��� ���������� �Է¹޾Ƽ� �Ű������� �޴� �迭�� ����
	{
		for(int i = 0; i < 3; i++)
		{
			ba[i] = new BankAccount("��", -1);
			System.out.print("������ �̸��� �Է��ϼ��� : ");
			ba[i].setOwner(scan.next());
			System.out.print("�ܰ� �Է��ϼ���: ");
			ba[i].setBalance(scan.nextInt());
		}

	}
	private static void printAccInfo(BankAccount[] ba)//�迭�� ����� ���� ���»�Ȳ�� ȭ�鿡 ���
	{
		System.out.println("\n���� �ܰ� ��Ȳ�Դϴ�.");
		System.out.println("���¹�ȣ\t������\t�ܰ�");
		for(int i = 0; i< 3; i++)
			System.out.println(ba[i].toString(i));
	}
	private static int getAccNum(Scanner scan) throws NoSuchAccountException//����ڿ��� ���¹�ȣ �Է¹޾Ƽ� ��ȯ, �߸��� ���¹�ȣ�� ���ؼ��� ���ܸ� �߻�, ���� ó������
	{
		int num;

		System.out.print("������Ʈ�� ���¹�ȣ�� �Է��ϼ���(����-0): ");
		num = scan.nextInt(); 

		if(num != 0 && num != 1 && num != 2 && num != 3)
			throw new NoSuchAccountException();
		
		return num;
	}	
	private static int getOperationNum(Scanner scan) throws NoSuchOperationException//����ڿ��� �۾���ȣ �Է¹޾Ƽ� ��ȯ, �߸��� ���¹�ȣ�� ���� ���ܹ߻�, ��øó�� ����
	{
		int num2; 

		System.out.print("���ϴ� �۾��� �����ϼ���(1-�Ա�/ 2-���): ");
		num2 = scan.nextInt();

		if(num2 == 1)
			return num2;
		else if(num2 == 2)
			return num2;
		else
			throw new NoSuchOperationException();

	}
}

