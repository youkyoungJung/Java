//20181013������
import java.util.*;
public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		  
		  String rcp;
		  int com;
		  String comg;
		  int sameCount = 0; // ���º�ȸ��
		  int winCount = 0; // �¼�
		  int loseCount = 0; // �м�
		  
		  System.out.println("���� ��������� : "+winCount+"�� "+sameCount+"�� "+loseCount+"��");
		  
		    while(true)
		  {
			
			  System.out.print("��ǻ���� ����: ");
			  com = (int) (Math.random() * 3) - 1;
			  if(com == -1)
			   comg = "����";
			  else if(com == 0)
			   comg = "����";
			  else
			   comg = "��";
			  
			  System.out.println(comg);
			  
			  System.out.print("����� �Է�: ");  
			  rcp = sc.nextLine();
				if(rcp.equals("�׸�"))
				  {
					  System.out.println("���α׷��� �����մϴ�.");
					  break;
				  }
			  if(whoswin(comg, rcp) == 1)
			   System.out.println("����� �̰���ϴ�");
			  else if(whoswin(comg, rcp) == -1)
			   System.out.println("����� �����ϴ�.");
			  else if(whoswin(comg, rcp) == 0)
			   System.out.println("�����ϴ�.");
			  
			  if(whoswin(comg, rcp) == -1)
					loseCount++;
				  else if(whoswin(comg, rcp) == 0)
					sameCount++;
				  else if(whoswin(comg, rcp) == 1)
				  	winCount++;
				  System.out.println("\n���� ����� ���� : "+winCount+"�� "+sameCount+"�� "+loseCount+"��");
			
	
		  }
			  
		  
		 }
		 public static int whoswin(String comg, String you)
		 {
		  if(comg.equals("����")) {
		   if(you.equals("����"))
		    return 0;
		   else if(you.equals("����"))
		    return 1;
		   else
		    return -1;
		  }
		  if(comg.equals("����")) {
		   if(you.equals("����"))
		    return 0;
		   else if(you.equals("��"))
		    return 1;
		   else
		    return -1;
		  }
		  if(comg.equals("��")) {
		   if(you.equals("��"))
		    return 0;
		   else if(you.equals("����"))
		    return 1;
		   else
		    return -1;
		  }
		  return 0;

		 }

	}

