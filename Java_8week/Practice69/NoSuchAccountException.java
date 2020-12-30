//20181013정유경, 잘못된 계좌번호를 입력한 경우에 발생
class NoSuchAccountException extends Exception
{
	public NoSuchAccountException()
	{
		super("잘못된 계좌번호입니다. 다시 입력하세요.");
	}
}
