//20181013������
public class Person implements Speakable{
	int age;
	String name;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void speak() {
		if(age >= 2)
			System.out.println("�ȳ�");
		else
			System.out.println("����");
	} 
}
