//20181013������
import java.util.*;
public class Practice38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1��° ������ x��ǥ: ");
		Pair p1 = new Pair(0, 0);
		p1.setX(new Integer(sc.next()));
		System.out.print("1��° ������ y��ǥ: ");
		p1.setY(new Integer(sc.next()));
		
		System.out.print("2��° ������ x��ǥ: ");
		Pair p2 = new Pair(0, 0);
		p2.setX(new Integer(sc.next()));
		System.out.print("2��° ������ y��ǥ: ");
		p2.setY(new Integer(sc.next()));
		
		System.out.print("�Էµ� 1�� ������: ");
		System.out.println(p1.toString());
		System.out.print("�Էµ� 2�� ������: ");
		System.out.println(p2.toString());
		
		System.out.println("���� ���: " + Pair.add(p1, p2));
		System.out.println("���� ���: " + Pair.sub(p1, p2));
		System.out.println("���� ���: " + Pair.mult(p1, p2));
		System.out.println("������ ���: " + Pair.div(p1, p2));
	}

}
