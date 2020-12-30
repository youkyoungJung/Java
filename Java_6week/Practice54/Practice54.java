//20181013정유경
public class Practice54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.println(s instanceof Shape);//true
		System.out.println(s instanceof Rectangle);//false
		System.out.println(s instanceof Triangle);//false
		System.out.println(s instanceof Movable);//true-shpae클래스가 movable클래스를 구현받고 있어서 가능하다.
		System.out.println(s instanceof Drawable);//false-shape클래스에는 rectangle, triangle, drawable 메소드의 관련 항목이 없기 때문에 false가 출력된다.
		
		System.out.println(r instanceof Shape);//true-rectangle클래스는 shape클래스에 상속받고 있다.
		System.out.println(r instanceof Rectangle);//true
		//System.out.println(r instanceof Triangle);//compile error
		System.out.println(r instanceof Movable);//true-shpae클래스가 movable클래스를 구현받고 있어서 가능하다.
		System.out.println(r instanceof Drawable);//true, 인터페이스 drawable클래스를 구현받고 있기 때문에 가능하다.
		
		System.out.println(t instanceof Shape);//ture-triangle클래스는 shape클래스에 상속받고 있다.
		//System.out.println(t instanceof Rectangle);//compile error
		System.out.println(t instanceof Triangle);//true
		System.out.println(t instanceof Movable);//true-shpae클래스가 movable클래스를 구현받고 있어서 가능하다.
		System.out.println(t instanceof Drawable);//true, 인터페이스 drawable클래스를 구현받고 있기 때문에 가능하다.
		
		//rectangle, triangle 둘다 shape의 자식 클래스 이기 떄문에 불가능하다.
	}

}
