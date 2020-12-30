import java.util.Scanner;

//20181013정유경
public class Practice48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Shape s1, s2, s3;
		s1 = new Shape();
		s2= new Rectangle();
		s3 = new Triangle();
		
		System.out.print("도형의 X좌표를 입력하세요: ");
		s1.setX(sc.nextInt());
		System.out.print("도형의 Y좌표를 입력하세요: ");
		s1.setY(sc.nextInt());
		System.out.println();
		
		System.out.print("사각형의 X좌표를 입력하세요: ");
		s2.setX(sc.nextInt());
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		s2.setY(sc.nextInt());
		System.out.print("사각형의 가로를 입력하세요: ");
		((Rectangle) s2).setLength(sc.nextDouble());
		System.out.print("사각형의 세로를 입력하세요: ");
		((Rectangle)s2).setWidth(sc.nextDouble());
		System.out.println();
		
		System.out.print("삼각형의 X좌표를 입력하세요: ");
		s3.setX(sc.nextInt());
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		s3.setY(sc.nextInt());
		System.out.print("삼각형의 밑변를 입력하세요: ");
		((Triangle) s3).setBase(sc.nextDouble());
		System.out.print("삼각형의 높이를 입력하세요: ");
		((Triangle)s3).setHeight(sc.nextDouble());
		System.out.println();
		
		System.out.println("입력된 도형의 정보입니다.");
		System.out.println(s1.toString());
		System.out.println("--이동 후 --");
		s1.move();
		System.out.println(s1.toString());
		System.out.println("\n입력된 사각형의 정보입니다.");
		System.out.println(((Rectangle)s2).toString());
		System.out.println("--이동 후 --");
		s2.move();
		System.out.println(((Rectangle)s2).toString());
		System.out.println("\n입력된 삼각형의 정보입니다.");
		System.out.println(((Triangle)s3).toString());
		System.out.println("--이동 후 --");
		s3.move();
		System.out.println(((Triangle)s3).toString());
	}

}
