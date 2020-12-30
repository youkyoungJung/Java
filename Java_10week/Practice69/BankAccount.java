//20181013정유경
public class BankAccount {
	private String owner;//계좌주 이름
	private int balance;//은행잔고

	public BankAccount() {
	
		owner = "모름";
		balance = -1;
		
	}
	
	public BankAccount(String owner, int balance)
	{
		this.owner = owner;
		this.balance = balance;
	}
	
	public void setOwner(String owner) {this.owner = owner;}
	public String getOwner() {return owner;}
	
	public void setBalance(int balance) {this.balance = balance;}
	public int getBalance() {return balance;}
	
	public String toString(int i)
	{
		String st = "";
	
		st += (i + 1) +"\t" +getOwner()+ "\t"+ getBalance();
		return st;
	}
	public void deposit(int money) throws NegativeBalanceException//예금
	{
		if(money < 0)
			throw new NegativeBalanceException("입금액이 음수입니다. 다시 입력하세요.");
		balance += money;
	}
	public void withdraw(int money)throws NegativeBalanceException//출금
	{
		if(balance > money)
			balance -= money;
		else if(balance < money)
			throw new NegativeBalanceException("잔고가 음수입니다, 다시입력하세요.");

		if(money < 0)
			throw new NegativeBalanceException("출금액이 음수입니다, 다시입력하세요.");
		
	}
}
