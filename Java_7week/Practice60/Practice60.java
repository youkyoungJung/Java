//20181013������
public class Practice60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n = Integer.parseInt("abc");
			System.out.println("try");
		}
		catch(NumberFormatException e) {
			System.out.println("���� ���� ����");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("continue running");
	}

}
