import java.util.Scanner;

//20181013������
public class Practice55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[3];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		s[0] = new Shape();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		
		System.out.print("������ X��ǥ�� �Է��ϼ���: ");
		s[0].setX(sc.nextInt());
		System.out.print("������ Y��ǥ�� �Է��ϼ���: ");
		s[0].setY(sc.nextInt());
		System.out.println();
		
		System.out.print("�簢���� X��ǥ�� �Է��ϼ���: ");
		s[1].setX(sc.nextInt());
		System.out.print("�簢���� Y��ǥ�� �Է��ϼ���: ");
		s[1].setY(sc.nextInt());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		((Rectangle)s[1]).setLength(sc.nextDouble());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		((Rectangle)s[1]).setWidth(sc.nextDouble());
		System.out.println();
		
		System.out.print("�ﰢ���� X��ǥ�� �Է��ϼ���: ");
		s[2].setX(sc.nextInt());
		System.out.print("�ﰢ���� Y��ǥ�� �Է��ϼ���: ");
		s[2].setY(sc.nextInt());
		System.out.print("�ﰢ���� �غ��� �Է��ϼ���: ");
		((Triangle)s[2]).setBase(sc.nextDouble());
		System.out.print("�ﰢ���� ���̸� �Է��ϼ���: ");
		((Triangle)s[2]).setHeight(sc.nextDouble());
		System.out.println();
		
		System.out.println("�Էµ� �����Դϴ�.");
		System.out.println();

		for (i = 0; i < 3; i++) {
			System.out.print((i + 1) + " : ");
			s[i].draw();
			System.out.println(s[i].toString());
		}
		System.out.println();

		System.out.println("--�������� �̵��մϴ�--");
		System.out.println();
		
		for (i = 0; i < 3; i++) {
			s[i].move();
		}
		for (i = 0; i < 3; i++) {
			System.out.print((i + 1) + " : ");
			s[i].draw();
			System.out.println(s[i].toString());
		}

	}

}
