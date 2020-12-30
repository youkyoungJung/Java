//20181013정유경
public class Practice23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Array = {
				{1, 2, 3, 4},
				{10, 20, 30, 40},
				{100, 200, 300, 400}
		};
		int i, j;
		int[] Colsum = new int[4];
		int[] Rowsum = new int[5];
		int total = 0;
		System.out.println("배열만 출력");
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 4; j++)
				System.out.print(Array[i][j] + "\t");
			System.out.println();
		}
		System.out.println("합과 함께 출력");
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 4; j++)
			{
				System.out.print(Array[i][j] + "\t");
				Colsum[j] += Array[i][j];
			}
			System.out.println();
		}
		for(j = 0; j < 4; j++)
			System.out.print(Colsum[j] + "\t");
		
		/*System.out.println("\n논리");
		for(i = 0; i < 3; i++)
		{
			Rowsum[i] = (int)Math.pow(10, (i + 1));
			total += Rowsum[i];
		}
		
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 4; j++)
			{
				System.out.print(Array[i][j] + "\t");
				Colsum[j] += Array[i][j];
			}
			System.out.print(Rowsum[i] + "\t");
			System.out.println();
		}
		for(j = 0; j < 4; j++)
			System.out.print(Colsum[j] + "\t");
		System.out.println(total);*/
	}
}
