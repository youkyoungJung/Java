//20181013Á¤À¯°æ
import java.util.*;
public class Practice38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1¹øÂ° ¼ø¼­½Ö xÁÂÇ¥: ");
		Pair p1 = new Pair(0, 0);
		p1.setX(new Integer(sc.next()));
		System.out.print("1¹øÂ° ¼ø¼­½Ö yÁÂÇ¥: ");
		p1.setY(new Integer(sc.next()));
		
		System.out.print("2¹øÂ° ¼ø¼­½Ö xÁÂÇ¥: ");
		Pair p2 = new Pair(0, 0);
		p2.setX(new Integer(sc.next()));
		System.out.print("2¹øÂ° ¼ø¼­½Ö yÁÂÇ¥: ");
		p2.setY(new Integer(sc.next()));
		
		System.out.print("ÀÔ·ÂµÈ 1¹ø ¼ø¼­½Ö: ");
		System.out.println(p1.toString());
		System.out.print("ÀÔ·ÂµÈ 2¹ø ¼ø¼­½Ö: ");
		System.out.println(p2.toString());
		
		System.out.println("µ¡¼À °á°ú: " + Pair.add(p1, p2));
		System.out.println("»¬¼À °á°ú: " + Pair.sub(p1, p2));
		System.out.println("°ö¼À °á°ú: " + Pair.mult(p1, p2));
		System.out.println("³ª´°¼À °á°ú: " + Pair.div(p1, p2));
	}

}
