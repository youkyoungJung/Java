//20181013������
import java.util.*;
public class Practice17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[10];
	
		int i = 0;
		int sum = 0;
		double average;
		for(i = 0; i < 10; i++)
		{
			num1[i] = (int)(Math.random() * 101);
			sum += num1[i];
			System.out.print(num1[i] + " ");
		}
		
		System.out.println();
		for(i = 9; i >= 0; i--)
		{
			System.out.print(num1[i] + " ");
		}
		average = (double)sum / 10;
		System.out.println("\n�������� ���� : " + sum);
		System.out.println("�������� ��� : " + average);
		
	}

}
