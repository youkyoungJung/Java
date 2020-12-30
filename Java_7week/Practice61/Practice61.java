//20181013정유경
import java.util.*;
public class Practice61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("정수를 입력하세요: ");
			String str = s.next();
			
			int num = Integer.parseInt(str);
			int[] array = new int[num];
			
			for(int i = 0; i < array.length; i++)
			{
				array[i] = i * 20;
			}
		}catch(NumberFormatException e) {
			System.out.println("숫자형식 오류");
		}catch(NegativeArraySizeException e) {
			System.out.println("배열 크기 음수 오류");
			return;
		}catch(Exception e) {
			System.out.println("오류");
		}finally {
			System.out.println("반드시 처리할 일");
		}
		System.out.println("continue running");
	}
}
