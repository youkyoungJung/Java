import java.util.*;
public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int i = 0;
		while(num < 10)
		{
			i = 0;
			while(i < 10)
			{
				if(i <= num) {
					System.out.print(i);
				}
				i++;
			}
			System.out.println();
			num++;
		}
	}
}
