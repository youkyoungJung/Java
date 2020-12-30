//20181013정유경
class NegativeBalanceException extends Exception
{
	public NegativeBalanceException()
	{	
		super("출금할 금액이 잔고보다 많습니다. 다시입력하세요.");
	}
}