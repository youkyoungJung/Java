//20181013������
public class Practice30{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setName("�赿��");
		s1.setAge(22);
		s1.setAddress("�����");
		s1.setSid(20132468);
		s1.setMajor("��ǻ����");
		System.out.println(s1.toString());
		
		Student s2 = new Student("ȫ�浿", 20181017L);
		s2.setAge(30);
		s2.setAddress("���ֽ�");
		s2.setMajor("��ǻ����");
		System.out.println(s2.toString());
		
		Student s3 = new Student("������",20121357L, "������");
		s3.setAge(16);
		s3.setAddress("������");
		System.out.println(s3.toString());
		
		System.out.println(s1.printSafely());
		System.out.println(s2.printSafely());
		System.out.println(s3.printSafely());
		
	}

}
