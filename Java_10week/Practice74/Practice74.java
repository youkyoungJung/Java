//20181013������
public class Practice74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyArrayAlg i1 = new MyArrayAlg();
		//MyArrayAlg d1 = new MyArrayAlg();
		
		Integer[] iArray = {30, 20, 10, 40};
		Double[] dArray = {3.14, 2.35, 1.23, 1.85};
		String[] sArray = {"apple", "banana", "orange"};
		
		System.out.println();

		try {
			System.out.print("������ �迭���� ���� ū �� : ");
			System.out.println(MyArrayAlg.getMax(iArray));
			System.out.print("������ �迭���� ���� ���� �� : ");
			System.out.println(MyArrayAlg.getMin(iArray));
			System.out.print("������ �迭���� �� �� : ");
			System.out.println(MyArrayAlg.getMinMax(iArray));
		} catch (ImproperArraySizeException e) {
			
			// TODO Auto-generated catch block
			e.getMessage();
		}
		System.out.println();
		
		
		try {
			System.out.print("�Ǽ��� �迭���� ���� ū �� : ");
			System.out.println(MyArrayAlg.getMax(dArray));
			System.out.print("�Ǽ��� �迭���� ���� ���� �� : ");
			System.out.println(MyArrayAlg.getMin(dArray));
			System.out.print("�Ǽ��� �迭���� �� �� : ");
			System.out.println(MyArrayAlg.getMinMax(dArray));
		} catch (ImproperArraySizeException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		System.out.println();
		
		try {
			System.out.println(MyArrayAlg.<Integer>getMax(new Integer[0]));
		} catch (ImproperArraySizeException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}

}
//o - a�� �̴�.���ĺ� ���������� ũ�Ⱑ ���ϱ� ������...