//20181013������
import java.util.*;
public class Practice32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Square s1 = new Square();
		System.out.print("�簢��1�� ���θ� �Է�: ");
		s1.setWidth(sc.nextInt());
		System.out.print("�簢��1�� ���θ� �Է�: ");
		s1.setHeight(sc.nextInt());
		
		Square s2 = new Square();
		System.out.print("�簢��2�� ���θ� �Է�: ");
		s2.setWidth(sc.nextInt());
		System.out.print("�簢��2�� ���θ� �Է�: ");
		s2.setHeight(sc.nextInt());
		
		if(s1.isSmallerThan(s2) == true)
			System.out.println("�簢��1�� ���̰� �� �۽��ϴ�");
		else if(s2.isSmallerThan(s1) == true)
			System.out.println("�簢��2�� ���̰� �� �۽��ϴ�");
		else
			System.out.println("�� �簢���� ���̰� �����ϴ�.");
			
	}

}
