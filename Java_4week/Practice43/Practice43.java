//20181013정유경
import java.util.*;
public class Practice43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date[] dateList = new Date[5];
		Date earlist = dateList[0];
		int i = 0;
		int cnt = 1;
		
		for(i = 0; i < dateList.length; i++)
		{
			dateList[i] = new Date();
			System.out.println((i + 1) +" 번째 날짜를 입려하세요.");
			System.out.print("년도 : ");
			dateList[i].setYear(sc.nextInt());
			System.out.print("월 : ");
			dateList[i].setMonth(sc.nextInt());
			System.out.print("일 : ");
			dateList[i].setDay(sc.nextInt());
		}
		
		for(i = 1; i < dateList.length; i++)
		{
			if(Date.compareDate(dateList[i], dateList[0]) == -1)
			{
				earlist = dateList[i];
				cnt++;
			}
		}
			System.out.println("가장 빠른 날짜는 " + cnt + "째 입력된 " + earlist.toString() + "입니다.");
	}

}
