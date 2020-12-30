//20181013정유경
public class Shape implements Movable{
	private int x;
	private int y;
	
	public void setX(int x) {this.x = x;}
	public int getX() {return x;}
	public void setY(int y) {this.y = y;}
	public int getY() {return y;}
	
	public Shape()
	{
		x = 0;
		y = 0;
	}
	public Shape(int x, int y)
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
	@Override
	public void move() {
		// TODO Auto-generated method stub
		x = (int)(Math.random() * 100);
		y = (int)(Math.random() * 100);
		
	}
}
