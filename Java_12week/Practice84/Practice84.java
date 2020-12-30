import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
//20181013정유경
//import java.util.*;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.OutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Practice84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int size = 0;
		int range = 0;
		int i = 0;
		int x = 0;
		try {
			String name = "";
		
			System.out.print("원하는 난수의 개수를 입력하세요: ");
			size = sc.nextInt();
			System.out.print("난수값의 범위를 설정하세요: ");
			range = sc.nextInt();

			System.out.println();
			System.out.println("생성된 난수 배열은 다음과 같습니다.");
			//printArray10PerLine(getRandomList(size, range));
			Random rg = new Random();
			ArrayList<Integer> list  = new ArrayList<Integer>();
			for(i = 0; i < size; i++) {
				x = rg.nextInt(range);
				list.add(x);
				System.out.print(x + "\t");
				if((i + 1) % 10 == 0)
					System.out.println();

			}
			
			System.out.println();
			System.out.print("\n난수 값을 저장할 파일 이름을 입력하세요 : ");
			name = sc.next();
		
			PrintWriter pw = new PrintWriter(new FileWriter(name));
		
			//pw.println(list);
			for(int e : list) {
				pw.println(e);
			}
			if(pw != null) {
				pw.close();
			}
			System.out.println("파일" + name + "에 난수값이 저장되었습니다.");
		}catch(Exception e) {
			e.getStackTrace();
		}

	}
}
