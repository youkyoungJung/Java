//20181013������
public class Person {
	private String name;
	private int age;
	private String address;
	
	public void Person()
	{
		name = "��";
		age = -1;
		address = "��";
	}
	public void Person(String name)
	{
		this.name = name;
	}
	public void Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void Person(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
	public void setAddress(String address) {this.address = address;}
	public String getAddress() {return address;}
	
	public String toString()
	{
		String print = "";
		print += "�̸�: " + getName() + ", ";
		print += "����: " + getAge() + "��, ";
		print += "�ּ�: " + getAddress() +", ";
		return print;
	}
	
}