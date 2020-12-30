//20181013정유경
public class Triangle extends Shape{
	protected double base;
	protected double height;
	
	protected void setBase(double base) {this.base = base;}
	protected double getBase() {return base;}
	protected void setHeight(double height) {this.height = height;}
	protected double getHeight() {return height;}
	
	public Triangle()
	{
	
	}
	public Triangle(int x, int y, double base)
	{
		super();
		this.base = base;
	}
	public Triangle(int x, int y, double base, double height)
	{
		super();
		this.base = base;
		this.height = height;
	}
	public double calcArea()
	{
		return ((double)getBase() * getHeight()) / 2;
	}
	public String toString()
	{

		String print = "";
		print += super.toString();
		print += ", 밑변 : ";
		print += getBase();
		print += ", 높이 :";
		print += getHeight();
		print += ", 면적: ";
		print += calcArea();
		return print;
		
	}
}
