//20181013������
import java.util.*;
public class Practice18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		int i;
		int find_num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭�� ����� ������ ���");
		printArray(num);
		System.out.print("\nã�� ���� ���ڸ� �Է��ϼ���: ");
		find_num = sc.nextInt();
		
		if(searchArray(num, find_num) != -1)
			System.out.println("�Էµ� ����" + find_num + "�� �迭�� " + searchArray(num, find_num) + "�� �ڸ��� �ֽ��ϴ�.");
		else
			System.out.println("�Էµ� ����" + find_num + "�� �迭�� �����ϴ�.");
	}
	public static int searchArray(int[] array, int key)
	{
		int i;
		
		for(i = 1; i <= 10; i++)
		{
			if(key == array[i])
				return i;
		}
			return -1;
	}
	public static void printArray(int[] array)
	{
		int i;
		for(i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * 101);
			System.out.print(array[i] + " ");
		}
		
	}

}
