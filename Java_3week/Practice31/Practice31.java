//20181013������
import java.util.*;
public class Practice31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int height;
		int weight;
		BodyData b1 = new BodyData();
		System.out.print("�� Ű�� �Է��ϼ���: ");
		b1.setHeight(sc.nextInt());
		System.out.print("�� �����Ը� �Է��ϼ���: ");
		b1.setWeight(sc.nextInt());
		
		BodyData b2 = new BodyData();
		System.out.print("����� Ű�� �Է��ϼ���: ");
		b2.setHeight(sc.nextInt());
		System.out.print("����� �����Ը� �Է��ϼ���: ");
		b2.setWeight(sc.nextInt());
		
		if(b1.isTallerThan(b2) == true)
			System.out.println("Ű�� ���� �� Ů�ϴ�.");
		else 
			System.out.println("Ű�� ����� �� Ů�ϴ�.");
		
		if(b1.needDiet() == true)
			System.out.println("���� ���̾�Ʈ�� �ʿ��մϴ�.");
		else
			System.out.println("���� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
		
		if(b2.needDiet() == true)
			System.out.println("����� ���̾�Ʈ�� �ʿ��մϴ�.");
		else
			System.out.println("����� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
	}

}
