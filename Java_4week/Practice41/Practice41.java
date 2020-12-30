//20181013정유경
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
			System.out.println((i + 1) +" 번째 날짜를 입력하세요.");
			System.out.print("년도 : ");
			dateList[i].setYear(sc.nextInt());
			System.out.print("월 : " );
			dateList[i].setMonth(sc.nextInt());
			System.out.print("일 : ");
			dateList[i].setDay(sc.nextInt());
		}
		
		for(i = 0; i < 5; i++)
		{
			System.out.println((i + 1) +"번째 날짜는 "+ dateList[i]+ "입니다.");
		}
	}

}
