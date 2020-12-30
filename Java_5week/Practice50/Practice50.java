//20181013정유경
public class Practice50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] sArray = new Shape[3];
		sArray[0] = new Shape();
		sArray[1] = new Rectangle();
		sArray[2] = new Triangle();
		
		System.out.println(sArray[0] instanceof Shape);//instanceof 는 true/false를 출력함. 따라서 결과는 true
		System.out.println(sArray[0] instanceof Rectangle);//false
		System.out.println(sArray[0] instanceof Triangle);//false
		System.out.println(sArray[1] instanceof Shape);//true, Rectangle클래스는 Shape클래스의 자손
		System.out.println(sArray[1] instanceof Rectangle);//true
		System.out.println(sArray[1] instanceof Triangle);//false
		System.out.println(sArray[2] instanceof Shape);//true, Triangle클래스는 Shape 클래스의 자손
		System.out.println(sArray[2] instanceof Rectangle);//false
		System.out.println(sArray[2] instanceof Triangle);//true
		
	}
}
