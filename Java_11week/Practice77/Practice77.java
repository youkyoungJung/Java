//20181013정유경
import java.util.*;
public class Practice77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int random;
		for(int j = 0; j < 10; j++) {
			Set<Integer>s = new HashSet<Integer>();
			s.clear();
			for(int i = 0; i < 5; i++) {
				random = (r.nextInt(89)) + 10;
				s.add(random);
			}	
			System.out.print("\n("+ (j + 1) + "회)" + s + "\t");
			System.out.println();
		}
		
	}

}
