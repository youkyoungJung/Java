@SuppressWarnings("serial")
//20181013정유경
class ImproperArraySizeException extends Exception{
	public ImproperArraySizeException(){
		super("잘못된 배열의 크기입니다 : 0");
	}
}
