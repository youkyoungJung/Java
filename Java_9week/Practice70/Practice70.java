//20181013������
import java.util.*;
public class Practice70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		MyBox<String>stringBox = new MyBox<String>();
		MyBox<Integer>intBox = new MyBox<Integer>();
		MyBox<Integer>intBox2 = new MyBox<Integer>();

		
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		stringBox.set(sc.nextLine());
		System.out.print("MyBox�� ����� ����: ");
		System.out.println(stringBox.get());
		
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		stringBox.set(sc.nextLine());
		System.out.print("MyBox�� ����� ����: ");
		System.out.println(stringBox.get());
		//MyBox.<String>stringBox.get();
		
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		intBox.set(sc.nextInt());
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		intBox2.set(sc.nextInt());
		System.out.println(intBox.get() +" + "+ intBox2.get() + " = " + (intBox.get() + intBox2.get()));
		
	}
}
