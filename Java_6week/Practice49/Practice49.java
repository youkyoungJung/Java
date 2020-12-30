import java.util.Scanner;

//20181013정유경
public class Practice49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		
		System.out.print("도형의 X좌표를 입력하세요: ");
		s.setX(sc.nextInt());
		System.out.print("도형의 Y좌표를 입력하세요: ");
		s.setY(sc.nextInt());
		System.out.println();
		
		System.out.print("사각형의 X좌표를 입력하세요: ");
		r.setX(sc.nextInt());
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		r.setY(sc.nextInt());
		System.out.print("사각형의 가로를 입력하세요: ");
		((Rectangle) r).setLength(sc.nextDouble());
		System.out.print("사각형의 세로를 입력하세요: ");
		((Rectangle) r).setWidth(sc.nextDouble());
		System.out.println();
		
		System.out.print("삼각형의 X좌표를 입력하세요: ");
		t.setX(sc.nextInt());
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		t.setY(sc.nextInt());
		System.out.print("삼각형의 밑변를 입력하세요: ");
		((Triangle) t).setBase(sc.nextDouble());
		System.out.print("삼각형의 높이를 입력하세요: ");
		((Triangle)t).setHeight(sc.nextDouble());
		System.out.println();
		
		System.out.println(s.toString());
		System.out.println("--이동 후 --");
		s.move();
		System.out.println(s.toString());
		System.out.println();
		
		r.draw();
		System.out.println(((Rectangle)r).toString());
		System.out.println("--이동 후 --");
		r.move();
		r.draw();
		System.out.println(((Rectangle)r).toString());
		System.out.println();
		
		t.draw();
		System.out.println(((Triangle)t).toString());
		System.out.println("--이동 후 --");
		t.move();
		t.draw();
		System.out.println(((Triangle)t).toString());
	}

}
