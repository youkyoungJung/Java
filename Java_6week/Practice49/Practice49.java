import java.util.Scanner;

//20181013������
public class Practice49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		
		System.out.print("������ X��ǥ�� �Է��ϼ���: ");
		s.setX(sc.nextInt());
		System.out.print("������ Y��ǥ�� �Է��ϼ���: ");
		s.setY(sc.nextInt());
		System.out.println();
		
		System.out.print("�簢���� X��ǥ�� �Է��ϼ���: ");
		r.setX(sc.nextInt());
		System.out.print("�簢���� Y��ǥ�� �Է��ϼ���: ");
		r.setY(sc.nextInt());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		((Rectangle) r).setLength(sc.nextDouble());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		((Rectangle) r).setWidth(sc.nextDouble());
		System.out.println();
		
		System.out.print("�ﰢ���� X��ǥ�� �Է��ϼ���: ");
		t.setX(sc.nextInt());
		System.out.print("�ﰢ���� Y��ǥ�� �Է��ϼ���: ");
		t.setY(sc.nextInt());
		System.out.print("�ﰢ���� �غ��� �Է��ϼ���: ");
		((Triangle) t).setBase(sc.nextDouble());
		System.out.print("�ﰢ���� ���̸� �Է��ϼ���: ");
		((Triangle)t).setHeight(sc.nextDouble());
		System.out.println();
		
		System.out.println(s.toString());
		System.out.println("--�̵� �� --");
		s.move();
		System.out.println(s.toString());
		System.out.println();
		
		r.draw();
		System.out.println(((Rectangle)r).toString());
		System.out.println("--�̵� �� --");
		r.move();
		r.draw();
		System.out.println(((Rectangle)r).toString());
		System.out.println();
		
		t.draw();
		System.out.println(((Triangle)t).toString());
		System.out.println("--�̵� �� --");
		t.move();
		t.draw();
		System.out.println(((Triangle)t).toString());
	}

}
