//20181013정유경, 출금액이 잔고보다 많은경우
class NegativeBalanceException extends Exception
{
	public NegativeBalanceException(String message)
	{	
		super(message);
	}
}
