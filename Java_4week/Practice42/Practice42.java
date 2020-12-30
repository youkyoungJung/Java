//20181013정유경
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
		System.out.println("첫 번째 날짜를 입려하세요.");

		System.out.print("년도 : ");
		dateList[0].setYear(sc.nextInt());
		System.out.print("월 : ");
		dateList[0].setMonth(sc.nextInt());
		System.out.print("일 : ");
		dateList[0].setDay(sc.nextInt());

		System.out.println("두 번째 날짜를 입려하세요.");

		System.out.print("년도 : ");
		dateList[1].setYear(sc.nextInt());
		System.out.print("월 : ");
		dateList[1].setMonth(sc.nextInt());
		System.out.print("일 : ");
		dateList[1].setDay(sc.nextInt());

		if(Date.compareDate(dateList[0], dateList[1]) == -1)
		{
			System.out.println("첫번째 날짜인 " + dateList[0].toString() + "이 이른 날짜 입니다.");
		}
		else if(Date.compareDate(dateList[0], dateList[1]) == 0)
		{
			System.out.println("두 날짜는 같은 날짜입니다.");
		}
		else
			System.out.println("두번 째 날짜인 " + dateList[1].toString() + "이 이른 날짜입니다.");
	}
}

