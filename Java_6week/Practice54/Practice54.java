//20181013������
public class Practice54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.println(s instanceof Shape);//true
		System.out.println(s instanceof Rectangle);//false
		System.out.println(s instanceof Triangle);//false
		System.out.println(s instanceof Movable);//true-shpaeŬ������ movableŬ������ �����ް� �־ �����ϴ�.
		System.out.println(s instanceof Drawable);//false-shapeŬ�������� rectangle, triangle, drawable �޼ҵ��� ���� �׸��� ���� ������ false�� ��µȴ�.
		
		System.out.println(r instanceof Shape);//true-rectangleŬ������ shapeŬ������ ��ӹް� �ִ�.
		System.out.println(r instanceof Rectangle);//true
		//System.out.println(r instanceof Triangle);//compile error
		System.out.println(r instanceof Movable);//true-shpaeŬ������ movableŬ������ �����ް� �־ �����ϴ�.
		System.out.println(r instanceof Drawable);//true, �������̽� drawableŬ������ �����ް� �ֱ� ������ �����ϴ�.
		
		System.out.println(t instanceof Shape);//ture-triangleŬ������ shapeŬ������ ��ӹް� �ִ�.
		//System.out.println(t instanceof Rectangle);//compile error
		System.out.println(t instanceof Triangle);//true
		System.out.println(t instanceof Movable);//true-shpaeŬ������ movableŬ������ �����ް� �־ �����ϴ�.
		System.out.println(t instanceof Drawable);//true, �������̽� drawableŬ������ �����ް� �ֱ� ������ �����ϴ�.
		
		//rectangle, triangle �Ѵ� shape�� �ڽ� Ŭ���� �̱� ������ �Ұ����ϴ�.
	}

}
