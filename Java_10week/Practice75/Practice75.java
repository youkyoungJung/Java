//20181013������
import java.util.*;
public class Practice75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		RandomList<Integer> array1 = new RandomList<Integer>();
		RandomList<String> array2 = new RandomList<String>();

		System.out.println("������ RandomList�� �����մϴ�.");
		System.out.print("����Ʈ�� ũ�⸦ �Է��ϼ���: ");
		int size = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
		System.out.print("�߰��ϰ� ���� ������ �Է��ϼ���: ");
		int num = sc.nextInt();
		array1.add(num);
		}
		System.out.println();
		
		System.out.println("����Ʈ�� ������ ����մϴ�.");
		array1.print();

		System.out.print("������ ���� ��� : ");
		System.out.println(array1.select());
		System.out.println();

		System.out.println("���ڿ� RandomList�� �����մϴ�.");
		System.out.print("����Ʈ�� ũ�⸦ �Է��ϼ���: ");
		size = sc.nextInt();

		for(int i = 0; i < size; i++) {
		System.out.print("�߰��ϰ� ���� ���ڿ��� �Է��ϼ���: ");
		String str = sc.next();
		array2.add(str);
		}
		System.out.println();
		
		System.out.println("����Ʈ�� ������ ����մϴ�.");
		array2.print();

		System.out.print("������ ���� ��� : ");
		System.out.println(array2.select());
		System.out.println();

	}

}
