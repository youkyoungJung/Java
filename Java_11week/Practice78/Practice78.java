//20181013������
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
		System.out.println();//1�� hashset���

		System.out.print("[");
		for(String a : set)
			System.out.print(a + ", ");
		System.out.print("]");
		System.out.println();//2�� for-each���

		Iterator<String>e = set.iterator();
		System.out.print("[");
		while(e.hasNext()) {
			String s = e.next();
			System.out.print(s + ", ");
		}
		System.out.print("]");
		System.out.println();//3�� Iterator���

		//4�� for_each���, ������ �޸� ���ֱ�, hashsetŬ���� size()�޼ҵ� �̿�,���� ���� Ȯ��
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
