//20181013정유경
import java.util.*;
public class Practice72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] sArray = {"하나", "두울", "세엣"};
		Integer[] iArray = {10, 20, 30, 40};
		int i, key = 0;
		
		System.out.println("문자열 배열의 내용입니다.");
		MyArray.<String>displayArray(sArray);
		System.out.println();
		
		for(i = 0; i < 2; i++)
		{
			try {
				System.out.print("문자열 배열에서 찾고 싶은 인덱스를 입력하세요: ");
				key = sc.nextInt();
				System.out.print(key + "번 인덱스 저장 내용 : ");
				System.out.println(MyArray.pick(sArray, key));
			} catch (IndexSizeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
		System.out.print("\n0번 인덱스에 저장된 값과 교환하고 싶은 인덱스를 선택하세요 : ");
		key = sc.nextInt();
		MyArray.swap(sArray, key, 0);
		System.out.println("변경후 문자열 배열");
		MyArray.<String>displayArray(sArray);
		System.out.println();
		
		System.out.println("\n정수형 배열의 내용입니다.");
		MyArray.<Integer>displayArray(iArray);
		System.out.println();
		
		for(i = 0; i < 2; i++)
		{
			
			try {
				System.out.print("\n정수 배열에서 찾고 싶은 인덱스를 입력하세요: ");
				key = sc.nextInt();
				System.out.print(key + "번 인덱스 저장 내용 : ");
				System.out.print(MyArray.pick(iArray, key));
		
			} catch (IndexSizeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}

}
