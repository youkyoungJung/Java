//20181013������
public class Practice47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		Person p1 = new Person("�赿��", 1);
		Person p2 = new Person("ȫ�浿", 20);

		speak3Times(myDog);
		speak3Times(p1);
		speak3Times(p2);
	}
	/*	private static void speak3Times(Dog d)
	{
		int i = 0;
		for(i = 0; i < 3; i++)
		{
			d.speak();
		}
	}
	private static void speak3Times(Person p)
	{
		int i = 0;
		for(i = 0; i < 3; i++)
			p.speak();
	}
*/
	private static void speak3Times(Speakable s)
	{
		int i;
		for(i = 0; i < 3; i++)
			s.speak();
	}
}