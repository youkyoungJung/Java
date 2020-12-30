//20181013정유경
public class Practice37A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		d1.setYear(2017);
		d1.setMonth(2);
		d1.setDay(18);
		System.out.println("오늘은 " + d1.toString() + "입니다.");
		
		Date d2 = new Date(2016);
		d2.setMonth(3);
		d2.setDay(2);
		System.out.println("내가 동덕여자대학교에 입학한 날짜는" + d2.toString() + "입니다.");
		
		Date d3 = new Date(2017, 2);
		Date d4 = new Date(2017, 3, 2);
		d3.setDay(27);
		System.out.println("2017학년도 개강일은 " + d3.toString() + " 에서" + d4.toString() + "로 변경되었습니다.");
		
		Date d5 = new Date(2017, 4);
		Date d6 = new Date(2017, 4, 26);
		d5 .setDay(20);
		System.out.println("중간고사 기간은 " + d5.toString() + "부터 " + d6.toString() + "까지 입니다.");
	}
}
