import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		int i;
		int find_num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열에 저장된 난수값 출력");
		for(i = 0; i < 10; i++)
		{
			num[i] = (int)(Math.random() * 101);
		}
		printArray(num);
		System.out.print("\n찾고 싶은 숫자를 입력하세요: ");
		find_num = sc.nextInt();
		
		if(searchArray(num, find_num) != -1)
			System.out.println("입력된 숫자" + find_num + "는 배열의 " + searchArray(num, find_num) + "번 자리에 있습니다.");
		else
			System.out.println("입력된 숫자" + find_num + "는 배열에 없습니다.");
	}
	public static int searchArray(int[] array, int key)
	{
		int i = 0;

		for(int s : array)
		{
			if(key == s)
			{
				return i;
			}
			i++;
		}
			return -1;
	}
	public static void printArray(int[] array)
	{
		for(int t : array)
		{ 
			System.out.print(t + " ");
			
		}
		
	}
}
