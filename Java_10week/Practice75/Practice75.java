//20181013정유경
import java.util.*;
public class Practice75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		RandomList<Integer> array1 = new RandomList<Integer>();
		RandomList<String> array2 = new RandomList<String>();

		System.out.println("정수형 RandomList를 생성합니다.");
		System.out.print("리스트의 크기를 입력하세요: ");
		int size = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
		System.out.print("추가하고 싶은 정수를 입력하세요: ");
		int num = sc.nextInt();
		array1.add(num);
		}
		System.out.println();
		
		System.out.println("리스트의 내용을 출력합니다.");
		array1.print();

		System.out.print("무작위 원소 출력 : ");
		System.out.println(array1.select());
		System.out.println();

		System.out.println("문자열 RandomList를 생성합니다.");
		System.out.print("리스트의 크기를 입력하세요: ");
		size = sc.nextInt();

		for(int i = 0; i < size; i++) {
		System.out.print("추가하고 싶은 문자열를 입력하세요: ");
		String str = sc.next();
		array2.add(str);
		}
		System.out.println();
		
		System.out.println("리스트의 내용을 출력합니다.");
		array2.print();

		System.out.print("무작위 원소 출력 : ");
		System.out.println(array2.select());
		System.out.println();

	}

}
