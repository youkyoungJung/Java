//20181013������
import java.util.*;
public class Practice42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		Date[] dateList = new Date[2];
		for(i = 0; i < dateList.length; i++)
		{
			dateList[i] = new Date();
		}
		System.out.println("ù ��° ��¥�� �Է��ϼ���.");

		System.out.print("�⵵ : ");
		dateList[0].setYear(sc.nextInt());
		System.out.print("�� : ");
		dateList[0].setMonth(sc.nextInt());
		System.out.print("�� : ");
		dateList[0].setDay(sc.nextInt());

		System.out.println("�� ��° ��¥�� �Է��ϼ���.");

		System.out.print("�⵵ : ");
		dateList[1].setYear(sc.nextInt());
		System.out.print("�� : ");
		dateList[1].setMonth(sc.nextInt());
		System.out.print("�� : ");
		dateList[1].setDay(sc.nextInt());

		if(Date.compareDate(dateList[0], dateList[1]) == -1)
		{
			System.out.println("ù��° ��¥�� " + dateList[0].toString() + "�� �̸� ��¥ �Դϴ�.");
		}
		else if(Date.compareDate(dateList[0], dateList[1]) == 0)
		{
			System.out.println("�� ��¥�� ���� ��¥�Դϴ�.");
		}
		else
			System.out.println("�ι� ° ��¥�� " + dateList[1].toString() + "�� �̸� ��¥�Դϴ�.");
	}
}

