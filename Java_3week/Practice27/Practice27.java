//20181013������
public class Practice27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		d1.setYear(2004);
		System.out.println(d1.getYear()+"����"+d1.testReapYears());
		
		Date d2 = new Date();
		d2.setYear(1997);
		System.out.println(d2.getYear()+"����"+d2.testReapYears());
		
		Date d3 = new Date();
		d3.setYear(1900);
		System.out.println(d3.getYear() + "����" + d3.testReapYears());
		
		Date d4 = new Date();
		d4.setYear(2000);
		System.out.println(d4.getYear() + "����" + d4.testReapYears());
		
	}

}
