//20181013정유경
import java.util.*;
public class Practice63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArray = getInput();
		
		for(int i = 0; i < iArray.length; i++)
		{
			iArray[i] = i;
		}
		for(int x : iArray)
		{
			System.out.print(x + "\t");
		}
	}
	public static int[] getInput() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요: ");
		String str = s.next();
		
		int num = Integer.parseInt(str);
		
		int[] rslt = makeArray(num);
		return rslt;
	}
	public static int[] makeArray(int size) {
		int[] r = new int[size];
		return r;
	}
}
