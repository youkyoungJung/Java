//20181013 정유경
public class Date {
	private Integer year;
	private Integer month;
	private Integer day;
	
	public Date()
	{
		this.year = 1990;
		this.month = 1;
		this.day = 1;
	}
	public Date(Integer year)
	{
		this.year = year;
	}
	public Date(Integer year, Integer month)
	{
		this.year = year;
		this.month = month;
	}
	public Date(Integer year, Integer month, Integer day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setYear(Integer year) {this.year = year;}
	public Integer getYear() {return year;}
	public void setMonth(Integer month) {this.month = month;}
	public Integer getMonth() {return month;}
	public void setDay(Integer day) {this.day = day;}
	public Integer getDay() {return day;}
	
	public String toString()
	{
		String print = "";
		print += getYear() + "년 ";
		print += getMonth() + "월 ";
		print += getDay() + "일";
		
		return print;
	}
	
}