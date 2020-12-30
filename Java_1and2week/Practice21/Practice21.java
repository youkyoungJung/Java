//20181013 정유경
import java.util.*;
public class Practice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[10];
		
		int i = 0;
		int sum = 0;
		double average;
		for(i = 0; i < 10; i++)
		{
			num1[i] = (int)(Math.random() * 101);
		}
	
		for(int one : num1)
			System.out.print(one + " ");
		System.out.println();
		for(i = 9; i >= 0; i--)
		{
			System.out.print(num1[i] + " ");
		}
		for(int j : num1)
		{
			sum += j;
		}
		average = (double)sum / 10;

		System.out.println("\n난수들의 총합 : " + sum);
		System.out.println("난수들의 평균 : " + average);

	}

}
