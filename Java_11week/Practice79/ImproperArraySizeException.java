//20181013정유경
@SuppressWarnings("serial")
public class ImproperArraySizeException extends Exception{
	public ImproperArraySizeException() {
		super("입력된 원소가 없는 상태입니다.");
	}
}
