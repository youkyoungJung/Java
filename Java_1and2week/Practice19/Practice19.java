//20181013������
import java.util.*;
public class Practice19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] num = new int[5];
		int cnt = 0;
		
		while(true)
		{
			printArray(num);
			System.out.println();
			cnt++;
			
			if(searchArray(num, 100) != -1)
				break;
		}
		  System.out.println(cnt + "�� ���࿡�� ���� 100�� �߻������Ƿ� ���α׷��� �����մϴ�.");

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
	public static int searchArray(int[] array, int key)
	{
		int i;
		
		for(i = 0; i < array.length; i++)
		{
			if(array[i] == key)
				return i;
		}
			return -1;
		
	}
	
}
