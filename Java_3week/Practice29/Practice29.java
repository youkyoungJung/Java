//20181013������
public class Practice29 extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("�赿��");
		p1.setAge(22);
		p1.setAddress("�����");
		System.out.println(p1.toString());
		
		Person p2 = new Person("ȫ�浿");
		p2.setAge(30);
		p2.setAddress("���ֽ�");
		System.out.println(p2.toString());
		
		Person p3 = new Person("������",16,"������");
		System.out.println(p3.toString());
		
	}

}
