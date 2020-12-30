//20181013정유경
public class Practice29 extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("김동덕");
		p1.setAge(22);
		p1.setAddress("서울시");
		System.out.println(p1.toString());
		
		Person p2 = new Person("홍길동");
		p2.setAge(30);
		p2.setAddress("제주시");
		System.out.println(p2.toString());
		
		Person p3 = new Person("성춘향",16,"남원시");
		System.out.println(p3.toString());
		
	}

}
