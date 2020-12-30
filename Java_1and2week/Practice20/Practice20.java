//20181013정유경
import java.util.*;
public class Practice20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int[] array = new int[3];
		int[] num = new int[3];
		
		printArray(array);
		System.out.println();
		for(i = 0; i < 3; i++)
		{
			System.out.print(i + "번째 숫자 입력 : ");
			num[i] = sc.nextInt();
		}
		System.out.println("자리와 값이 모두 같은 숫자 : " + searchArray1(array, num));
		System.out.println("자리는 다르고 값만 같은 숫자 : " + searchArray2(array, num));
	}	
		public static int searchArray1(int[] array, int[] num)
		{
			int i;
			int cnt = 0;
			
			for(i = 0; i < array.length; i++)
			{
				if(array[i] == num[i])
					cnt++;
			}
			return cnt;
		}
		
		public static int searchArray2(int[] array, int[] num)
		{
			int i, j;
			int cnt = 0;
			
			for(i = 0; i < array.length; i++)
			{
				for(j = 0; j <num.length; j++)
				{
					if(array[i] == num[j])
						cnt++;
				}
			}
			return (cnt - searchArray1(array, num));
		}
		
		public static void printArray(int[] array)
		{
			int i;
			for(i = 0; i < array.length; i++)
			{
				array[i] = (int)((Math.random() * 9) + 1);
				System.out.print(array[i] + " ");
			}
			
		}
	

}
