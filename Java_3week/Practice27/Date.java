//20181013 정유경
public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date()
	{
		this.year = 1990;
		this.month = 1;
		this.day = 1;
	}
	public Date(int  year)
	{
		this.year = year;
	}
	public Date(int year, int month)
	{
		this.year = year;
		this.month = month;
	}
	public Date(int year, int month, int day)
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
	
	protected boolean isReap()
	{
		if(getYear() % 400 == 0)
			return true;
		else if(getYear() % 100 == 0)
			return false;
		else if(getYear() % 4 == 0)
			return true;
		else
			return false;
	}
	public String testReapYears()
	{
		String rslt = "";
		if(isReap() == true)
			rslt += "윤년입니다.";
		else
			rslt += "윤년이 아닙니다.";
		return rslt;
	}
	public String toString()
	{
		String print = "";
		print += getYear() + "년 ";
		print += getMonth() + "월 ";
		print += getDay() + "일";
		
		return print;
	}
	
}