//20181013������
import java.util.*;
public class Practice61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("������ �Է��ϼ���: ");
			String str = s.next();
			
			int num = Integer.parseInt(str);
			int[] array = new int[num];
			
			for(int i = 0; i < array.length; i++)
			{
				array[i] = i * 20;
			}
		}catch(NumberFormatException e) {
			System.out.println("�������� ����");
		}catch(NegativeArraySizeException e) {
			System.out.println("�迭 ũ�� ���� ����");
			return;
		}catch(Exception e) {
			System.out.println("����");
		}finally {
			System.out.println("�ݵ�� ó���� ��");
		}
		System.out.println("continue running");
	}
}
