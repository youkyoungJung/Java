//20181013������
public class Practice50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] sArray = new Shape[3];
		sArray[0] = new Shape();
		sArray[1] = new Rectangle();
		sArray[2] = new Triangle();
		
		System.out.println(sArray[0] instanceof Shape);//instanceof �� true/false�� �����. ���� ����� true
		System.out.println(sArray[0] instanceof Rectangle);//false
		System.out.println(sArray[0] instanceof Triangle);//false
		System.out.println(sArray[1] instanceof Shape);//true, RectangleŬ������ ShapeŬ������ �ڼ�
		System.out.println(sArray[1] instanceof Rectangle);//true
		System.out.println(sArray[1] instanceof Triangle);//false
		System.out.println(sArray[2] instanceof Shape);//true, TriangleŬ������ Shape Ŭ������ �ڼ�
		System.out.println(sArray[2] instanceof Rectangle);//false
		System.out.println(sArray[2] instanceof Triangle);//true
		
	}
}
