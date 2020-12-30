//20181013정유경
import java.util.*;
public class Practice79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner sc = new Scanner(System.in);

		RandomList<Integer> array1 = new RandomList<Integer>();
		System.out.println("정수형 RandomList를 생성합니다.");

		do {
			try {
				System.out.print("원하는 기능을 선택하세요.(1-추가/2-출력/3-무작위/4-종료):");
				num = sc.nextInt();
				//System.out.println();

				if(num == 1)
				{
					System.out.print("추가하고 싶은 원소의 개수를 입력하세요: ");
					int p = sc.nextInt();

					for(int i = 0; i < p; i++)
					{
						System.out.print("[" + (i + 1) + "]번 원소 : ");
						int num2 = sc.nextInt();
						
						array1.add(num2);
					}
				}

				else if(num == 2)
				{
					array1.print();
					System.out.println();
				}

				else if(num == 3)
				{
					System.out.print("무작위 원소 출력 : " + array1.select());
					System.out.println();
				}
			} catch (ImproperArraySizeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}while(num != 4);

		System.out.println("프로그램을 종료합니다.");

	}
}