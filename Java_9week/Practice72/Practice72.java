//20181013������
import java.util.*;
public class Practice72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] sArray = {"�ϳ�", "�ο�", "����"};
		Integer[] iArray = {10, 20, 30, 40};
		int i, key = 0;
		
		System.out.println("���ڿ� �迭�� �����Դϴ�.");
		MyArray.<String>displayArray(sArray);
		System.out.println();
		
		for(i = 0; i < 2; i++)
		{
			try {
				System.out.print("���ڿ� �迭���� ã�� ���� �ε����� �Է��ϼ���: ");
				key = sc.nextInt();
				System.out.print(key + "�� �ε��� ���� ���� : ");
				System.out.println(MyArray.pick(sArray, key));
			} catch (IndexSizeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
		System.out.print("\n0�� �ε����� ����� ���� ��ȯ�ϰ� ���� �ε����� �����ϼ��� : ");
		key = sc.nextInt();
		MyArray.swap(sArray, key, 0);
		System.out.println("������ ���ڿ� �迭");
		MyArray.<String>displayArray(sArray);
		System.out.println();
		
		System.out.println("\n������ �迭�� �����Դϴ�.");
		MyArray.<Integer>displayArray(iArray);
		System.out.println();
		
		for(i = 0; i < 2; i++)
		{
			
			try {
				System.out.print("\n���� �迭���� ã�� ���� �ε����� �Է��ϼ���: ");
				key = sc.nextInt();
				System.out.print(key + "�� �ε��� ���� ���� : ");
				System.out.print(MyArray.pick(iArray, key));
		
			} catch (IndexSizeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}

}
