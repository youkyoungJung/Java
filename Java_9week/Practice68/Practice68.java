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
			b[i] = new BankAccount("모름", -1);
			System.out.print("예금주 이름을 입력하세요 : ");
			b[i].setOwner(sc.next());
			System.out.print("잔고를 입력하세요: ");
			b[i].setBalance(sc.nextInt());
		}
		System.out.println("현재 잔고 현황입니다.");
		System.out.println("계좌번호\t계좌주\t잔고");
		for(i = 0; i< 3; i++)
			System.out.println(b[i].toString(i));

		while(true)
		{
			System.out.print("업데이트할 계좌번호를 입력하세요(종료-0): ");
			num = sc.nextInt();
			if(num == 0)
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else
			{
				System.out.print("원하는 작업은 선택하세요(1-입금/ 2-출금): ");
				num2 = sc.nextInt();

				if(num2 == 1)
				{
					System.out.print("입금액을 입력하세요: ");
					money = sc.nextInt();
					b[num -1].deposit(money);
					System.out.println("입금이 완료되었습니다.");

					System.out.println("현재 잔고 현황입니다.");
					System.out.println("계좌번호\t계좌주\t잔고");
					for(i = 0; i < 3; i++)
						System.out.println(b[i].toString(i));
				}

				else if(num2 == 2)
				{
					System.out.print("출금액을 입력하세요: ");
					money = sc.nextInt(); 
					try {
						b[num - 1].withdraw(money);
					} catch (NegativeBalanceException e) {
						// TODO Auto-generated catch block
						//printStackTrace();
						System.out.println(e.getMessage());
						continue;
					}
					System.out.println("출금이 완료되었습니다.");

					System.out.println("현재 잔고 현황입니다.");
					System.out.println("계좌번호\t계좌주\t잔고");
					for(i = 0; i < 3; i++)
						System.out.println(b[i].toString(i));

				}
			}
		}
	}

}

