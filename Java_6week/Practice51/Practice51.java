//20181013������
public class Practice51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable[] rArray = new Movable[2];
		
		rArray[0] = new Rectangle();
		rArray[1] = new Triangle();
		
		System.out.println(rArray[0] instanceof Rectangle);//true
		System.out.println(rArray[0] instanceof Triangle);//false
		System.out.println(rArray[0] instanceof Movable);//true, shape���� ������. ����
		System.out.println(rArray[0] instanceof Drawable);//true, rectangle���� drawable �������̽� ������.
		System.out.println(rArray[1] instanceof Rectangle);//false
		System.out.println(rArray[1] instanceof Triangle);//true
		System.out.println(rArray[1] instanceof Movable);//trueshape���� ������. ����
		System.out.println(rArray[1] instanceof Drawable);//true, triangle���� drawable �������̽� ������.
		//retangle, triangle -> shape�� �ڽ� Ŭ����. ǥ�� �Ұ����ϴ�.
	}

}
