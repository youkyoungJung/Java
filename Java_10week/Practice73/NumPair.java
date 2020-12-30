//20181013Á¤À¯°æ

public class NumPair<T extends Number> {
	private T first;
	private T second;
	
	public NumPair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	public T getFirst() {return first;}
	public void setFirst(T first) {this.first = first;}
	public T getSecond() {return second;}
	public void setSecond(T second) {this.second = second;}
	
	public String toString() {
		String pt = "";
		pt += "(";
		pt += getFirst();
		pt += ", ";
		pt += getSecond();
		pt += ")";
		return pt;
	}

	public NumPair<T>flip(){
		T tmp = getFirst();
		first = getSecond();
		second = tmp;
		
		NumPair<T> a = new NumPair<T>(first, second);
		return a;
	}
	public double calcAverage() {
		
		double d1 = first.doubleValue();
		double d2 = second.doubleValue();
		double av;
		av = (d1 + d2) / 2;
		return av;
	}
}
