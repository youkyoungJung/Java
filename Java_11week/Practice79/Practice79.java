//20181013������
import java.util.*;
public class Practice79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner sc = new Scanner(System.in);

		RandomList<Integer> array1 = new RandomList<Integer>();
		System.out.println("������ RandomList�� �����մϴ�.");

		do {
			try {
				System.out.print("���ϴ� ����� �����ϼ���.(1-�߰�/2-���/3-������/4-����):");
				num = sc.nextInt();
				//System.out.println();

				if(num == 1)
				{
					System.out.print("�߰��ϰ� ���� ������ ������ �Է��ϼ���: ");
					int p = sc.nextInt();

					for(int i = 0; i < p; i++)
					{
						System.out.print("[" + (i + 1) + "]�� ���� : ");
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
					System.out.print("������ ���� ��� : " + array1.select());
					System.out.println();
				}
			} catch (ImproperArraySizeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}while(num != 4);

		System.out.println("���α׷��� �����մϴ�.");

	}
}