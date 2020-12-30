//20181013정유경
public class Person {
	private String name;
	private int age;
	private String address;
	
	Person()
	{
		name = "모름";
		age = -1;
		address = "모름";
	}
	Person(String name)
	{
		this.name = name;
	}
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	Person(String name, int age, String address)
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
		print += "이름: " + getName() + ", ";
		print += "나이: " + getAge() + "세, ";
		print += "주소: " + getAddress();
		return print;
	}
}
