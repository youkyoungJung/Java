//20181013������
public class BankAccount {
	private String owner;//������ �̸�
	private int balance;//�����ܰ�

	public BankAccount() {
	
		owner = "��";
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
	public void deposit(int money)//����
	{
		balance += money;
	}
	public void withdraw(int money)//���
	{
		balance -= money;
	}
}
