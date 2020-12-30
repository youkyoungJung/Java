//20181013������
public class Rectangle extends Shape{

	protected double length;
	protected double width;
	
	protected void setLength(double length) {this.length = length;}
	protected double getLength() {return length;}
	protected void setWidth(double width) {this.width = width;}
	protected double getWidth() {return width;}
	
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
		print +=  ",���� : ";
		print += getLength();
		print += ", ";
		print += "���� : ";
		print += getWidth();
		print += ", ";
		print += "���� : ";
		print += calcArea();
		return print;
		
	}
}