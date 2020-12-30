//20181013Á¤À¯°æ
public class MyArrayAlg {
	public static <T extends Comparable<T>> T getMax(T[] a) throws ImproperArraySizeException{
		if(a == null || a.length == 0)
			throw new ImproperArraySizeException();
		T max = a[0];
		
		for(int i = 1; i < a.length; i++) 
		{
			if(max.compareTo(a[i]) < 0)
				max = a[i];
		}
		return max;
	}
	public static <T extends Comparable<T>> T getMin(T[] a) throws ImproperArraySizeException {
		if(a == null || a.length == 0)
			throw new ImproperArraySizeException();
		T min = a[0];
		
		for(int i = 1; i < a.length; i++) 
		{
			if(min.compareTo(a[i]) > 0)
				min = a[i];
		}
		return min;
	}
	public static <T extends Comparable<T>> MyPair<T> getMinMax(T[] a) throws ImproperArraySizeException{
		if(a == null || a.length == 0)
			throw new ImproperArraySizeException();
	
		T first;
		T second;
		
		first = getMax(a);
		second = getMin(a);	
	
		MyPair<T> mm = new MyPair<T>(first, second);
		return mm;
	
	}
}
