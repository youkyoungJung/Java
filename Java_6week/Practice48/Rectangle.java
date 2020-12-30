//20181013정유경
public class Rectangle extends Shape {

	private double length;
	private double width;
	
	public void setLength(double length) {this.length = length;}
	public double getLength() {return length;}
	public void setWidth(double width) {this.width = width;}
	public double getWidth() {return width;}
	
	Rectangle()
	{
		
	}
	Rectangle(int x, int y, double length)
	{
		super();
		this.length = length;
	}
	Rectangle(int x, int y, double length, double width)
	{
		super();
		this.length = length;
		this.width = width;
	}
	public double calcArea()
	{
		return (double) getLength() * getWidth();
	}
	public String toString()
	{
		
		String print = "";
		print += super.toString();
		print +=  ",가로 : ";
		print += getLength();
		print += ", ";
		print += "세로 : ";
		print += getWidth();
		print += ", ";
		print += "면적 : ";
		print += calcArea();
		return print;
		
	}
	
}
