//20181013정유경
public class Student extends Person{
	private long sid;
	private String major;
	
	public void setSid(long sid) {this.sid = sid;}
	public long getSid() {return sid;}
	public void setMajor(String major) {this.major = major;}
	public String getMajor() {return major;}
	
	public Student()
	{
		super.Person();
		sid = -1;
		major= "모름";
	}
	
	public Student(String name)
	{
		super.Person(name);
	}
	
	public Student(String name, long sid)
	{
		super.Person(name);
		this.sid = sid;
	}
	public Student(String name, long sid, String major)
	{
		super.Person(name);
		this.sid = sid;
		this.major = major;
	}
	public String toString()
	{
		super.toString();
		String pt = "";
		pt += " 학번: " + getSid();
		pt += ", 전공: " + getMajor();
		return (super.toString()) +pt;
	}
	public String printSafely()
	{
		String ps = "";
		ps += "이름: " + getName();
		ps += ", 학번: " + getSid();
		ps += ", 전공: " + getMajor();
		return ps;
	}
	public boolean isTheSame(Student s)
	{
		if(getSid() == s.getSid())
			return true;
		return false;
	}

}
