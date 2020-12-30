//20181013정유경
public class Person implements Speakable{
	int age;
	String name;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void speak() {
		if(age >= 2)
			System.out.println("안녕");
		else
			System.out.println("응애");
	} 
}
