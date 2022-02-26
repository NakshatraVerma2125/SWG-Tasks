package Task1;

public class Student {
	private String name;
	private double marks;
	private int rollNumber;
	private double attendance;
	
	// constructor
	public Student(String name, double marks, int rollNumber, double attendance) {
		this.name = name;
		this.marks = marks;
		this.rollNumber = rollNumber;
		this.attendance = attendance;
	}
	
	// getter functions
	public String getName() {
		return name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public double getAttendance() {
		return attendance;
	}
	public double getMarks() {
		return marks;
	}
	
	// setter functions
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(double marks) {
		if(marks < 0) marks = 0.0;
		if(marks > 100) marks = 100.0;
		this.marks = marks;
	}
	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
}
