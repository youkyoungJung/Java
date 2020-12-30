//20181013정유경
import java.util.*;
public class Practice73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumPair<Integer> i1 = new NumPair<Integer>(10, 20);
		NumPair<Integer> i2 = new NumPair<Integer>(0, 0);
		
		System.out.print("Integer 순서쌍 i1: ");
		System.out.println(i1.toString());
		System.out.println();
		
		System.out.print("기존의 순서쌍 순서쌍 i1: ");
		System.out.println(i1.toString());
		i2 = i1.flip();
		System.out.print("Flip 실행 결과 순서쌍 i2: ");
		System.out.println(i2.toString());
		System.out.println();
		
		System.out.println("i1의 평균값 : " + i1.calcAverage());
		System.out.println("i2의 평균값: " + i2.calcAverage());
		System.out.println();
		
		NumPair<Double>d1 = new NumPair<Double>(1.25, 4.32);
		NumPair<Double>d2 = new NumPair<Double>(0.0, 0.0);
		
		System.out.print("Double 순서쌍 d1: ");
		System.out.println(d1.toString());
		System.out.println();
		
		
		System.out.print("기존의 순서쌍 순서쌍 d1: ");
		System.out.println(d1.toString());
		d2 = d1.flip();
		System.out.print("Flip 실행 결과 순서쌍 d2: ");
		System.out.println(d2.toString());
		System.out.println();
		
		System.out.println("d1의 평균값 : " + d1.calcAverage());
		System.out.println("d2의 평균값: " + d2.calcAverage());
		
		/*
		 * (1)오류발생이유 ->i1과 d1은 타입이 달라 호환할수 없다..
		 * (2)NumPair<String>s1 = new NumPair<String>(사과, 배);
		NumPair<String>s2 = new NumPair<String>(null, null); -> Number클래스에 상속될 수 없다.*/
	}

}
