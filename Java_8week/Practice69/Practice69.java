//20181013정유경
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
					System.out.println("프로그램을 종료합니다");
					return;
				}
				if(num <= 3) {
					num2 = getOperationNum(sc);	
					if(num2 == 1)
					{
						System.out.print("입금액을 입력하세요: ");
						money = sc.nextInt();
						b[num -1].deposit(money);
						System.out.println("입금이 완료되었습니다.");
					}

					else if(num2 == 2)
					{
						System.out.print("출금액을 입력하세요: ");
						money = sc.nextInt(); 
						b[num - 1].withdraw(money);
						System.out.println("출금이 완료되었습니다.");
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
	private static void getAcclnfo(Scanner scan, BankAccount[] ba)//사용자에게 계좌정보를 입력받아서 매개변수로 받는 배열에 저장
	{
		for(int i = 0; i < 3; i++)
		{
			ba[i] = new BankAccount("모름", -1);
			System.out.print("예금주 이름을 입력하세요 : ");
			ba[i].setOwner(scan.next());
			System.out.print("잔고를 입력하세요: ");
			ba[i].setBalance(scan.nextInt());
		}

	}
	private static void printAccInfo(BankAccount[] ba)//배열에 저장된 현재 계좌상황을 화면에 출력
	{
		System.out.println("\n현재 잔고 현황입니다.");
		System.out.println("계좌번호\t계좌주\t잔고");
		for(int i = 0; i< 3; i++)
			System.out.println(ba[i].toString(i));
	}
	private static int getAccNum(Scanner scan) throws NoSuchAccountException//사용자에게 계좌번호 입력받아서 반환, 잘못된 계좌번호에 대해서는 예외를 발생, 직접 처리않함
	{
		int num;

		System.out.print("업데이트할 계좌번호를 입력하세요(종료-0): ");
		num = scan.nextInt(); 

		if(num != 0 && num != 1 && num != 2 && num != 3)
			throw new NoSuchAccountException();
		
		return num;
	}	
	private static int getOperationNum(Scanner scan) throws NoSuchOperationException//사용자에게 작업번호 입력받아서 반환, 잘못된 계좌번호에 대해 예외발생, 직첩처리 않함
	{
		int num2; 

		System.out.print("원하는 작업은 선택하세요(1-입금/ 2-출금): ");
		num2 = scan.nextInt();

		if(num2 == 1)
			return num2;
		else if(num2 == 2)
			return num2;
		else
			throw new NoSuchOperationException();

	}
}

