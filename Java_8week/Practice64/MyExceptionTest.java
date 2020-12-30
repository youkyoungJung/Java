//20181013정유경
public class MyExceptionTest {
	public static void checkNegative(int number) throws MyException{
		if(number < 0) {
			throw(new MyException("음수는 안됩니다."));
		}
		System.out.println("다행히 음수가 아니군요.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkNegative(1);
			checkNegative(-1);
		}catch(MyException ex) {ex.printStackTrace();}
	}

}
//checkNegative()메소드는 음수가 전달되면 사용자 예외를 발생합니다.