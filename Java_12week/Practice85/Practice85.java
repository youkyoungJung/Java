import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.io.FileReader;
//20181013������
public class Practice85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "";
		int i = 0;
		int s = 0;
		int cnt = 0;
		try {
			System.out.print("�������� ����� ���� �̸��� �Է��ϼ���: ");
			name = sc.next();
		
			System.out.println("���Ͽ��� ������ �о� ���Դϴ�.");
			
			ArrayList<Integer> list  = new ArrayList<Integer>();
			Scanner scan = new Scanner(new FileReader(name));
		
			while(scan.hasNext()) {
				s = scan.nextInt();
				list.add(s);
				
			}
			System.out.println("������ ������ ���" + list.size() + "�� �Դϴ�.");
			System.out.println("�Էµ� ���� �迭�� ������ �����ϴ�.");
			for(int a : list) {
				System.out.print(a + "\t");	
				if((cnt + 1) % 10 == 0)
					System.out.println();
				cnt++;
			}
			System.out.println();
			System.out.println("���ĵ� ������ ������ �����ϴ�.");
			Collections.sort(list);
			cnt = 0;
			for(int b : list) {	
				System.out.print(b + "\t");
				if((cnt + 1) % 10 == 0)
					System.out.println();
				cnt++;
				
			}
			if(scan != null) {
				scan.close();
			}

		}catch(Exception e) {
			e.getStackTrace();
		}

	}

}
