//20181013정유경
import java.util.*;
public class Practice70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		MyBox<String>stringBox = new MyBox<String>();
		MyBox<Integer>intBox = new MyBox<Integer>();
		MyBox<Integer>intBox2 = new MyBox<Integer>();

		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		stringBox.set(sc.nextLine());
		System.out.print("MyBox에 저장된 내용: ");
		System.out.println(stringBox.get());
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		stringBox.set(sc.nextLine());
		System.out.print("MyBox에 저장된 내용: ");
		System.out.println(stringBox.get());
		//MyBox.<String>stringBox.get();
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		intBox.set(sc.nextInt());
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		intBox2.set(sc.nextInt());
		System.out.println(intBox.get() +" + "+ intBox2.get() + " = " + (intBox.get() + intBox2.get()));
		
	}
}
