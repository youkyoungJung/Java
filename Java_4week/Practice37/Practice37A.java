//20181013������
public class Practice37A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		d1.setYear(2017);
		d1.setMonth(2);
		d1.setDay(18);
		System.out.println("������ " + d1.toString() + "�Դϴ�.");
		
		Date d2 = new Date(2016);
		d2.setMonth(3);
		d2.setDay(2);
		System.out.println("���� �������ڴ��б��� ������ ��¥��" + d2.toString() + "�Դϴ�.");
		
		Date d3 = new Date(2017, 2);
		Date d4 = new Date(2017, 3, 2);
		d3.setDay(27);
		System.out.println("2017�г⵵ �������� " + d3.toString() + " ����" + d4.toString() + "�� ����Ǿ����ϴ�.");
		
		Date d5 = new Date(2017, 4);
		Date d6 = new Date(2017, 4, 26);
		d5 .setDay(20);
		System.out.println("�߰���� �Ⱓ�� " + d5.toString() + "���� " + d6.toString() + "���� �Դϴ�.");
	}
}
