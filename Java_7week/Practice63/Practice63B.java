//20181013������
import java.util.*;
public class Practice63B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}
	public static int[] getInput() {
		Scanner s = new Scanner(System.in);
		int num = 0;
		int[] rslt = null;

		try {
			System.out.print("�迭�� ũ�⸦ �Է��ϼ���: ");
			String str = s.next();
			num = Integer.parseInt(str);
			rslt = makeArray(num);

		}catch(NumberFormatException e){
			System.out.println("�߸��� ������ �����Դϴ�.");

		}
		catch (NegativeArraySizeException e) {
			// TODO Auto-generated catch block
			System.out.println("�迭�� ũ�Ⱑ �����Դϴ�.");
		}
		finally {
			s.close();
		}
		return rslt;
	}
	public static int[] makeArray(int size) throws NegativeArraySizeException{
		int[] r = new int[size];
			return r;
	}
}
