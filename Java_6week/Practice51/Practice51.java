//20181013정유경
public class Practice51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable[] rArray = new Movable[2];
		
		rArray[0] = new Rectangle();
		rArray[1] = new Triangle();
		
		System.out.println(rArray[0] instanceof Rectangle);//true
		System.out.println(rArray[0] instanceof Triangle);//false
		System.out.println(rArray[0] instanceof Movable);//true, shape에서 구현함. 가능
		System.out.println(rArray[0] instanceof Drawable);//true, rectangle에서 drawable 인터페이스 구현함.
		System.out.println(rArray[1] instanceof Rectangle);//false
		System.out.println(rArray[1] instanceof Triangle);//true
		System.out.println(rArray[1] instanceof Movable);//trueshape에서 구현함. 가능
		System.out.println(rArray[1] instanceof Drawable);//true, triangle에서 drawable 인터페이스 구현함.
		//retangle, triangle -> shape의 자식 클래스. 표현 불가능하다.
	}

}
