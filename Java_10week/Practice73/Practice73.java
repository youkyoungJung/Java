//20181013������
import java.util.*;
public class Practice73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumPair<Integer> i1 = new NumPair<Integer>(10, 20);
		NumPair<Integer> i2 = new NumPair<Integer>(0, 0);
		
		System.out.print("Integer ������ i1: ");
		System.out.println(i1.toString());
		System.out.println();
		
		System.out.print("������ ������ ������ i1: ");
		System.out.println(i1.toString());
		i2 = i1.flip();
		System.out.print("Flip ���� ��� ������ i2: ");
		System.out.println(i2.toString());
		System.out.println();
		
		System.out.println("i1�� ��հ� : " + i1.calcAverage());
		System.out.println("i2�� ��հ�: " + i2.calcAverage());
		System.out.println();
		
		NumPair<Double>d1 = new NumPair<Double>(1.25, 4.32);
		NumPair<Double>d2 = new NumPair<Double>(0.0, 0.0);
		
		System.out.print("Double ������ d1: ");
		System.out.println(d1.toString());
		System.out.println();
		
		
		System.out.print("������ ������ ������ d1: ");
		System.out.println(d1.toString());
		d2 = d1.flip();
		System.out.print("Flip ���� ��� ������ d2: ");
		System.out.println(d2.toString());
		System.out.println();
		
		System.out.println("d1�� ��հ� : " + d1.calcAverage());
		System.out.println("d2�� ��հ�: " + d2.calcAverage());
		
		/*
		 * (1)�����߻����� ->i1�� d1�� Ÿ���� �޶� ȣȯ�Ҽ� ����..
		 * (2)NumPair<String>s1 = new NumPair<String>(���, ��);
		NumPair<String>s2 = new NumPair<String>(null, null); -> NumberŬ������ ��ӵ� �� ����.*/
	}

}
