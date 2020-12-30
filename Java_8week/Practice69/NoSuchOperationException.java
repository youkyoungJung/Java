//20181013정유경, 잘못된 작업번호를 입력한 경우에 발생
public class NoSuchOperationException extends Exception
{
	public NoSuchOperationException()
	{
		super("잘못된 작업입니다. 다시 입력하세요.");
	}
}
