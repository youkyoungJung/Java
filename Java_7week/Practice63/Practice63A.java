import java.util.Scanner;

public class Practice63A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArray = getInput();

		if(iArray != null) {
			for(int i = 0; i < iArray.length; i++)
			{
				iArray[i] = i;
			}
		}
		for(int x : iArray)
		{
			System.out.print(x + "\t");
		}
	}
	public static int[] getInput() {
		Scanner s = new Scanner(System.in);
		int num = 0;

		try {
			System.out.print("�迭�� ũ�⸦ �Է��ϼ���: ");
			String str = s.next();
			num = Integer.parseInt(str);

		}catch(NumberFormatException e){
			System.out.println("�߸��� ������ �����Դϴ�.");
		}finally {
			s.close();
		}
		int[] rslt = makeArray(num);
		return rslt;
	}
	public static int[] makeArray(int size) {
		int[] r = null;
		try {
			r = new int[size];
		}catch(NegativeArraySizeException e){
			System.out.println("�迭�� ũ�Ⱑ �����Դϴ�.");
		}
		return r;
	}
}
