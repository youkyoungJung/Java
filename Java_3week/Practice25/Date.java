//20181013 ������
public class Date {
	private int year;
	private int month;
	private int day;
	
	Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setYear(int year) {this.year = year;}
	public int getYear() {return year;}
	public void setMonth(int month) {this.month = month;}
	public int getMonth() {return month;}
	public void setDay(int day) {this.day = day;}
	public int getDay() {return day;}
	
	public String toString()
	{
		String print = "";
		print += getYear() + "�� ";
		print += getMonth() + "�� ";
		print += getDay() + "��";
		
		return print;
	}
	
}
