import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.io.FileReader;
//20181013정유경
public class Practice85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "";
		int i = 0;
		int s = 0;
		int cnt = 0;
		try {
			System.out.print("난수값이 저장된 파일 이름을 입력하세요: ");
			name = sc.next();
		
			System.out.println("파일에서 난수를 읽어 들입니다.");
			
			ArrayList<Integer> list  = new ArrayList<Integer>();
			Scanner scan = new Scanner(new FileReader(name));
		
			while(scan.hasNext()) {
				s = scan.nextInt();
				list.add(s);
				
			}
			System.out.println("난수의 개수는 모두" + list.size() + "개 입니다.");
			System.out.println("입력된 난수 배열은 다음과 같습니다.");
			for(int a : list) {
				System.out.print(a + "\t");	
				if((cnt + 1) % 10 == 0)
					System.out.println();
				cnt++;
			}
			System.out.println();
			System.out.println("정렬된 난수는 다음과 같습니다.");
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
