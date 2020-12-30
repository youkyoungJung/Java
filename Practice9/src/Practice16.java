//20181013정유경
import java.util.*;
public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		  
		  String rcp;
		  int com;
		  String comg;
		  int sameCount = 0; // 무승부회수
		  int winCount = 0; // 승수
		  int loseCount = 0; // 패수
		  
		  System.out.println("현재 당신의전적 : "+winCount+"승 "+sameCount+"무 "+loseCount+"패");
		  
		    while(true)
		  {
			
			  System.out.print("컴퓨터의 생성: ");
			  com = (int) (Math.random() * 3) - 1;
			  if(com == -1)
			   comg = "바위";
			  else if(com == 0)
			   comg = "가위";
			  else
			   comg = "보";
			  
			  System.out.println(comg);
			  
			  System.out.print("당신의 입력: ");  
			  rcp = sc.nextLine();
				if(rcp.equals("그만"))
				  {
					  System.out.println("프로그램을 종료합니다.");
					  break;
				  }
			  if(whoswin(comg, rcp) == 1)
			   System.out.println("당신이 이겼습니다");
			  else if(whoswin(comg, rcp) == -1)
			   System.out.println("당신이 졌습니다.");
			  else if(whoswin(comg, rcp) == 0)
			   System.out.println("비겼습니다.");
			  
			  if(whoswin(comg, rcp) == -1)
					loseCount++;
				  else if(whoswin(comg, rcp) == 0)
					sameCount++;
				  else if(whoswin(comg, rcp) == 1)
				  	winCount++;
				  System.out.println("\n현재 당신의 전적 : "+winCount+"승 "+sameCount+"무 "+loseCount+"패");
			
	
		  }
			  
		  
		 }
		 public static int whoswin(String comg, String you)
		 {
		  if(comg.equals("가위")) {
		   if(you.equals("가위"))
		    return 0;
		   else if(you.equals("바위"))
		    return 1;
		   else
		    return -1;
		  }
		  if(comg.equals("바위")) {
		   if(you.equals("바위"))
		    return 0;
		   else if(you.equals("보"))
		    return 1;
		   else
		    return -1;
		  }
		  if(comg.equals("보")) {
		   if(you.equals("보"))
		    return 0;
		   else if(you.equals("가위"))
		    return 1;
		   else
		    return -1;
		  }
		  return 0;

		 }

	}

