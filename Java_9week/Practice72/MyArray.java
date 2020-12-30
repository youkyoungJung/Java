//20181013Á¤À¯°æ
public class MyArray<T> {
	public static <T> T pick(T[] a, int key) throws IndexSizeException{
		if(key < 0 || key >= a.length) {
			throw new IndexSizeException();
		}
		return a[key];
	}
public static<T> void displayArray(T[] a){
		for(T array : a) {
			System.out.print(array + "\t");
		}
	}
	
	public static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
