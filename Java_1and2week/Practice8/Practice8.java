import java.util.Random;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rg = new Random();
		
		for(int z = 1; z <= 10; z++)
		{
			System.out.println("("+ z +"Â÷ ½ÇÇà)");
			for(int y = 1; y <= 10; y++)
				System.out.print(rg.nextInt(100) + "	");
			System.out.println();
		}
	}

}
