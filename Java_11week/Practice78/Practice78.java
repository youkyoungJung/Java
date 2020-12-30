//20181013정유경
import java.util.*;
public class Practice78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		HashSet<String> set = new HashSet<String>();
		set.add("Bread");
		set.add("Milk");
		set.add("Butter");
		set.add("Ham");
		set.add("Chease");

		System.out.print(set);
		System.out.println();//1번 hashset사용

		System.out.print("[");
		for(String a : set)
			System.out.print(a + ", ");
		System.out.print("]");
		System.out.println();//2번 for-each사용

		Iterator<String>e = set.iterator();
		System.out.print("[");
		while(e.hasNext()) {
			String s = e.next();
			System.out.print(s + ", ");
		}
		System.out.print("]");
		System.out.println();//3번 Iterator사용

		//4번 for_each사용, 마지막 콤마 없애기, hashset클래스 size()메소드 이용,원소 개수 확인
		//set.size();
		System.out.print("[");

		for(String a : set) {			
			System.out.print(a);
			cnt++; 
			
			if(set.size() != cnt)
				System.out.print(", ");
			}
	
		System.out.print("]");
		System.out.println();
	}

}
