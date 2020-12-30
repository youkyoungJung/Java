//20181013정유경
public class Student {
	private int id;
	private int tuition;
	private double gpa;
	
	public Student()
	{
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	public Student(int id, int tuition, double gpa)
	{
		super();
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	public int getTuition() {return tuition;}
	public void setTuition(int tuition) {this.tuition = tuition;}
	
	public double getGpa() {return gpa;}
	public void setGpa(double gpa) {this.gpa = gpa;}
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public String toString()
	{
		String rslt = "";
		
		rslt += "학번: " + id + ", 등록금: " + tuition;
		rslt += ", 평균등급: " + gpa;
		rslt += ", 장학금: " + scholarship();
		
		return rslt;
	}
	public int scholarship() {
		//장학금의 50%
		return (int)(tuition * 0.5);
	}
}
