//20181013정유경
import java.util.*;
public class Practice31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int height;
		int weight;
		BodyData b1 = new BodyData();
		System.out.print("내 키를 입력하세요: ");
		b1.setHeight(sc.nextInt());
		System.out.print("내 몸무게를 입력하세요: ");
		b1.setWeight(sc.nextInt());
		
		BodyData b2 = new BodyData();
		System.out.print("당신의 키를 입력하세요: ");
		b2.setHeight(sc.nextInt());
		System.out.print("당신의 몸무게를 입력하세요: ");
		b2.setWeight(sc.nextInt());
		
		if(b1.isTallerThan(b2) == true)
			System.out.println("키는 내가 더 큽니다.");
		else 
			System.out.println("키는 당신이 더 큽니다.");
		
		if(b1.needDiet() == true)
			System.out.println("나는 다이어트가 필요합니다.");
		else
			System.out.println("나는 다이어트가 필요하지 않습니다.");
		
		if(b2.needDiet() == true)
			System.out.println("당신의 다이어트가 필요합니다.");
		else
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
	}

}
