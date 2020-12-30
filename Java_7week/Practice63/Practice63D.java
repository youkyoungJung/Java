//20181013정유경
import java.util.*;
public class Practice63D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] iArray = getInput();

			if(iArray != null) {
				for(int i = 0; i < iArray.length; i++)
				{
					iArray[i] = i;
				}
				for(int x : iArray)
				{
					System.out.print(x + "\t");
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("잘못된 형식의 숫자입니다.");
		}
		catch (NegativeArraySizeException e) {
			// TODO Auto-generated catch block
			System.out.println("배열의 크기가 음수입니다.");
		}
	}

	public static int[] getInput() throws NumberFormatException{
		Scanner s = new Scanner(System.in);
		int num = 0;

		System.out.print("배열의 크기를 입력하세요: ");
		String str = s.next();
		num = Integer.parseInt(str);

		int[] rslt = makeArray(num);
		return rslt;
	}
	public static int[] makeArray(int size) throws NegativeArraySizeException{
		int[] r = new int[size];
		return r;
	}

}
