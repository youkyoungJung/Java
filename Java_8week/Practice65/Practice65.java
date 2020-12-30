//20181013������
import java.util.*;
public class Practice65 {
	public static int searchArray(int array[], int key)throws NotFoundException
	{
		int i = 0;
		for(i = 0; i < array.length; i++)
		{
			if(array[i] == key)
				System.out.println("�Էµ� ���� " + key + "�� �ε��� " + i + "���� �����մϴ�.");
		}
		throw new NotFoundException(key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("10���� ������ �߻����Ѽ� �迭�� �����մϴ�.");
		for(int i = 0; i < 10; i++)
		{
			a[i] = (int)(Math.random() * 100);
		}
		
		for(int array : a)
			System.out.print(array + "\t");
		System.out.println();
		System.out.print("���ڸ� �ϳ� �Է��ϼ���: ");
		int key = sc.nextInt();
		
		try {
			searchArray(a, key);
		}catch(NotFoundException e) {
			e.printStackTrace();
		}
	}

}
