//20181013정유경
import java.util.*;
public class Practice65 {
	public static int searchArray(int array[], int key)throws NotFoundException
	{
		int i = 0;
		for(i = 0; i < array.length; i++)
		{
			if(array[i] == key)
				System.out.println("입력된 숫자 " + key + "는 인덱스 " + i + "번에 존재합니다.");
		}
		throw new NotFoundException(key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("10개의 난수를 발생시켜서 배열에 저장합니다.");
		for(int i = 0; i < 10; i++)
		{
			a[i] = (int)(Math.random() * 100);
		}
		
		for(int array : a)
			System.out.print(array + "\t");
		System.out.println();
		System.out.print("숫자를 하나 입력하세요: ");
		int key = sc.nextInt();
		
		try {
			searchArray(a, key);
		}catch(NotFoundException e) {
			e.printStackTrace();
		}
	}

}
