import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
//20181013������
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
		
			System.out.print("���ϴ� ������ ������ �Է��ϼ���: ");
			size = sc.nextInt();
			System.out.print("�������� ������ �����ϼ���: ");
			range = sc.nextInt();

			System.out.println();
			System.out.println("������ ���� �迭�� ������ �����ϴ�.");
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
			System.out.print("\n���� ���� ������ ���� �̸��� �Է��ϼ��� : ");
			name = sc.next();
		
			PrintWriter pw = new PrintWriter(new FileWriter(name));
		
			//pw.println(list);
			for(int e : list) {
				pw.println(e);
			}
			if(pw != null) {
				pw.close();
			}
			System.out.println("����" + name + "�� �������� ����Ǿ����ϴ�.");
		}catch(Exception e) {
			e.getStackTrace();
		}

	}
}
