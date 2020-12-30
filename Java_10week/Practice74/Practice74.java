//20181013정유경
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
			System.out.print("정수형 배열에서 가장 큰 값 : ");
			System.out.println(MyArrayAlg.getMax(iArray));
			System.out.print("정수형 배열에서 가장 작은 값 : ");
			System.out.println(MyArrayAlg.getMin(iArray));
			System.out.print("정수형 배열에서 끝 값 : ");
			System.out.println(MyArrayAlg.getMinMax(iArray));
		} catch (ImproperArraySizeException e) {
			
			// TODO Auto-generated catch block
			e.getMessage();
		}
		System.out.println();
		
		
		try {
			System.out.print("실수형 배열에서 가장 큰 값 : ");
			System.out.println(MyArrayAlg.getMax(dArray));
			System.out.print("실수형 배열에서 가장 작은 값 : ");
			System.out.println(MyArrayAlg.getMin(dArray));
			System.out.print("실수형 배열에서 끝 값 : ");
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
//o - a순 이다.알파벳 순서에따라서 크기가 변하기 떄문에...