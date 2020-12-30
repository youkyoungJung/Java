//20181013정유경
public class Shape {
	protected int x;
	protected int y;
	
	protected void setX(int x) {this.x = x;}
	protected int getX() {return x;}
	protected void setY(int y) {this.y = y;}
	protected int getY() {return y;}
	
	protected Shape()
	{
		x = 0;
		y = 0;
	}
	protected Shape(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public double calcArea()
	{
		return -1;
	}
	
	public String toString()
	{
		String print = "";
		print += "중심좌표: ";
		print += "(";
		print += getX();
		print += ",";
		print += getY();
		print += ")";
		return print;
	}
}
