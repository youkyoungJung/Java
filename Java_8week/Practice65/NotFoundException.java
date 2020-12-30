//20181013정유경
class NotFoundException extends Exception{
	public NotFoundException(int key) {
		super("입력된 숫자 " + key + "은 배열에서 존재하지 않습니다.");
	}
}