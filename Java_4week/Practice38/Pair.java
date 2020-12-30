//20181013Á¤À¯°æ
public class Pair {
	private Integer x;
	private Integer y;
	
	public Pair(int x, int y)
	{
	}
	
	public void setX(Integer x) {this.x = x;}
	public Integer getX() {return x;}
	public void setY(Integer y) {this.y = y;}
	public Integer getY() {return y;}
	
	public String toString()
	{
		String pt = "";
		pt += "(";
		pt += getX();
		pt += ", ";
		pt += getY();
		pt += ")";
		return pt;
		
	}
	
	public static Pair add(Pair a, Pair b)
	{
		Pair calc = new Pair(0, 0);
		
		calc.setX(a.getX() + b.getY());
		calc.setY(a.getY() + b.getY());
		return calc;
	}
	public static Pair sub(Pair a, Pair b)
	{
		Pair calc = new Pair(0, 0);
		calc.setX(a.getX() - b.getX());
		calc.setY(a.getY() - b.getY());
		return calc;
	}
	public static Pair mult(Pair a, Pair b)
	{
		Pair calc = new Pair(0, 0);
		calc.setX(a.getX() * a.getX());
		calc.setY(a.getY() * b.getY());
		return calc;
	}
	public static Pair div(Pair a, Pair b)
	{
		Pair calc = new Pair(0, 0);
		calc.setX(a.getX() / b.getX());
		calc.setY(a.getY() / b.getY());
		return calc;
	}
}
