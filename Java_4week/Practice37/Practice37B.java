//20181013������
public class Practice37B {

	public static void main(String[] arg) {
		Date d1 = new Date();
		d1.setYear(new Integer(2017));
		d1.setMonth(new Integer(2));
		d1.setDay(new Integer(18));
		
		Date d2 = new Date();
		d2.setMonth(new Integer(3));
		d2.setDay(new Integer(2));
		
		Date d3 = new Date();
		d3.setDay(new Integer(27));
		
		Date d4 = new Date(new Integer(2017), new Integer(3), new Integer(2));
		
		Date d5 = new Date(new Integer(2017), new Integer(4));
		d5.setDay(new Integer(20));
		
		Date d6 = new Date(new Integer(2017), new Integer(4), new Integer(26));
		
		String n1 = d1.toString();
		String n2 = d2.toString();
		String n3 = d3.toString();
		String n4 = d4.toString();
		String n5 = d5.toString();
		String n6 = d6.toString();
		
		System.out.println("������ " + n1 + "�Դϴ�.");
		System.out.println("���� �������ڴ��б��� ������ ��¥�� "+ n2 + "�Դϴ�.");
		System.out.println("2017�г⵵ �������� " + n3 + "���� " + n4 + "�� ����Ǿ����ϴ�.");
		System.out.println("�߰���� �Ⱓ�� " + n5 + "���� " + n6 + "���� �Դϴ�.");
	}
}
