import java.util.*;
public class Practice68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money, num, num2;
		int i = 0;

		BankAccount[] b = new BankAccount[3];
		Scanner sc = new Scanner(System.in);

		for(i = 0; i < 3; i++)
		{
			b[i] = new BankAccount("��", -1);
			System.out.print("������ �̸��� �Է��ϼ��� : ");
			b[i].setOwner(sc.next());
			System.out.print("�ܰ� �Է��ϼ���: ");
			b[i].setBalance(sc.nextInt());
		}
		System.out.println("���� �ܰ� ��Ȳ�Դϴ�.");
		System.out.println("���¹�ȣ\t������\t�ܰ�");
		for(i = 0; i< 3; i++)
			System.out.println(b[i].toString(i));

		while(true)
		{
			System.out.print("������Ʈ�� ���¹�ȣ�� �Է��ϼ���(����-0): ");
			num = sc.nextInt();
			if(num == 0)
			{
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			else
			{
				System.out.print("���ϴ� �۾��� �����ϼ���(1-�Ա�/ 2-���): ");
				num2 = sc.nextInt();

				if(num2 == 1)
				{
					System.out.print("�Աݾ��� �Է��ϼ���: ");
					money = sc.nextInt();
					b[num -1].deposit(money);
					System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");

					System.out.println("���� �ܰ� ��Ȳ�Դϴ�.");
					System.out.println("���¹�ȣ\t������\t�ܰ�");
					for(i = 0; i < 3; i++)
						System.out.println(b[i].toString(i));
				}

				else if(num2 == 2)
				{
					System.out.print("��ݾ��� �Է��ϼ���: ");
					money = sc.nextInt(); 
					try {
						b[num - 1].withdraw(money);
					} catch (NegativeBalanceException e) {
						// TODO Auto-generated catch block
						//printStackTrace();
						System.out.println(e.getMessage());
						continue;
					}
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");

					System.out.println("���� �ܰ� ��Ȳ�Դϴ�.");
					System.out.println("���¹�ȣ\t������\t�ܰ�");
					for(i = 0; i < 3; i++)
						System.out.println(b[i].toString(i));

				}
			}
		}
	}

}

