//20181013������
import java.util.*;
public class Practice33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int w1, w2, h1, h2;
		System.out.print("�簢��1�� ���θ� �Է�: ");
		w1 = sc.nextInt();
		System.out.print("�簢��1�� ���θ� �Է�: ");
		h1 = sc.nextInt();
		Square s1 = Square.getInstance(w1, h1);
		
		System.out.print("�簢��2�� ���θ� �Է�: ");
		w2 = sc.nextInt();
		System.out.print("�簢��2�� ���θ� �Է�: ");
		h2 = sc.nextInt();
		Square s2 = Square.getInstance(w2, h2);
		
		if(s1.isSmallerThan(s2) == true)
			System.out.println("�簢��1�� ���̰� �� �۽��ϴ�");
		else if(s2.isSmallerThan(s1) == true)
			System.out.println("�簢��2�� ���̰� �� �۽��ϴ�");
		else
			System.out.println("�� �簢���� ���̰� �����ϴ�.");
	}


}