import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//20181013정유경
public class Practice80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = 0;
		int range = 0;
		System.out.print("원하는 난수의 개수를 입력하세요: ");
		size = sc.nextInt();
		System.out.print("난수값의 범위를 설정하세요: ");
		range = sc.nextInt();
		
		System.out.println();
		System.out.println("생성된 난수 배열은 다음과 같습니다.");
		printArray10PerLine(getRandomList(size, range));
	}
	public static void printArray10PerLine(ArrayList<Integer>a) {
		int i = 0;
		for(i = 0; i < a.size(); i++)
		{
			System.out.print(a.get(i) + "\t");	
		
			if((i + 1) % 10 == 0)
				System.out.println();
		}	
		
	
	}
	public static ArrayList<Integer>getRandomList(int size, int range){
		 ArrayList<Integer> list  = new ArrayList<Integer>();
		 int i;
		 ArrayList<Integer> tmp = new ArrayList<Integer>();
		for(i = 0; i < range; i++)
			list.add(i);
		Collections.shuffle(list);
		for(int j = 0; j < size; j++) {
			tmp.add(list.get(j));
		}
		
		return tmp;
	      
	}

}
