//20181013������
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
		
		rslt += "�й�: " + id + ", ��ϱ�: " + tuition;
		rslt += ", ��յ��: " + gpa;
		rslt += ", ���б�: " + scholarship();
		
		return rslt;
	}
	public int scholarship() {
		//���б��� 50%
		return (int)(tuition * 0.5);
	}
}
