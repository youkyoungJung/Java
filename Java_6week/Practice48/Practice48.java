import java.util.Scanner;

//20181013������
public class Practice48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Shape s1, s2, s3;
		s1 = new Shape();
		s2= new Rectangle();
		s3 = new Triangle();
		
		System.out.print("������ X��ǥ�� �Է��ϼ���: ");
		s1.setX(sc.nextInt());
		System.out.print("������ Y��ǥ�� �Է��ϼ���: ");
		s1.setY(sc.nextInt());
		System.out.println();
		
		System.out.print("�簢���� X��ǥ�� �Է��ϼ���: ");
		s2.setX(sc.nextInt());
		System.out.print("�簢���� Y��ǥ�� �Է��ϼ���: ");
		s2.setY(sc.nextInt());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		((Rectangle) s2).setLength(sc.nextDouble());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		((Rectangle)s2).setWidth(sc.nextDouble());
		System.out.println();
		
		System.out.print("�ﰢ���� X��ǥ�� �Է��ϼ���: ");
		s3.setX(sc.nextInt());
		System.out.print("�ﰢ���� Y��ǥ�� �Է��ϼ���: ");
		s3.setY(sc.nextInt());
		System.out.print("�ﰢ���� �غ��� �Է��ϼ���: ");
		((Triangle) s3).setBase(sc.nextDouble());
		System.out.print("�ﰢ���� ���̸� �Է��ϼ���: ");
		((Triangle)s3).setHeight(sc.nextDouble());
		System.out.println();
		
		System.out.println("�Էµ� ������ �����Դϴ�.");
		System.out.println(s1.toString());
		System.out.println("--�̵� �� --");
		s1.move();
		System.out.println(s1.toString());
		System.out.println("\n�Էµ� �簢���� �����Դϴ�.");
		System.out.println(((Rectangle)s2).toString());
		System.out.println("--�̵� �� --");
		s2.move();
		System.out.println(((Rectangle)s2).toString());
		System.out.println("\n�Էµ� �ﰢ���� �����Դϴ�.");
		System.out.println(((Triangle)s3).toString());
		System.out.println("--�̵� �� --");
		s3.move();
		System.out.println(((Triangle)s3).toString());
	}

}
