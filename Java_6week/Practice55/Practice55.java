import java.util.Scanner;

//20181013정유경
public class Practice55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[3];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		s[0] = new Shape();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		
		System.out.print("도형의 X좌표를 입력하세요: ");
		s[0].setX(sc.nextInt());
		System.out.print("도형의 Y좌표를 입력하세요: ");
		s[0].setY(sc.nextInt());
		System.out.println();
		
		System.out.print("사각형의 X좌표를 입력하세요: ");
		s[1].setX(sc.nextInt());
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		s[1].setY(sc.nextInt());
		System.out.print("사각형의 가로를 입력하세요: ");
		((Rectangle)s[1]).setLength(sc.nextDouble());
		System.out.print("사각형의 세로를 입력하세요: ");
		((Rectangle)s[1]).setWidth(sc.nextDouble());
		System.out.println();
		
		System.out.print("삼각형의 X좌표를 입력하세요: ");
		s[2].setX(sc.nextInt());
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		s[2].setY(sc.nextInt());
		System.out.print("삼각형의 밑변를 입력하세요: ");
		((Triangle)s[2]).setBase(sc.nextDouble());
		System.out.print("삼각형의 높이를 입력하세요: ");
		((Triangle)s[2]).setHeight(sc.nextDouble());
		System.out.println();
		
		System.out.println("입력된 정보입니다.");
		System.out.println();

		for (i = 0; i < 3; i++) {
			System.out.print((i + 1) + " : ");
			s[i].draw();
			System.out.println(s[i].toString());
		}
		System.out.println();

		System.out.println("--도형들을 이동합니다--");
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
