//20181013������
import java.util.*;
public class Practice41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		Date[]dateList = new Date[5];
	
		for(i = 0; i < 5; i++)
		{
			dateList[i] = new Date(0, 0, 0);
			System.out.println((i + 1) +" ��° ��¥�� �Է��ϼ���.");
			System.out.print("�⵵ : ");
			dateList[i].setYear(sc.nextInt());
			System.out.print("�� : " );
			dateList[i].setMonth(sc.nextInt());
			System.out.print("�� : ");
			dateList[i].setDay(sc.nextInt());
		}
		
		for(i = 0; i < 5; i++)
		{
			System.out.println((i + 1) +"��° ��¥�� "+ dateList[i]+ "�Դϴ�.");
		}
	}

}
