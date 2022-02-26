package Task1;

public class StudentTest {
	public static void main(String[] args) {
		Student stu1 = new Student("Noddy", 10, 1, 30);
		Student stu2 = new Student("Nakshatra", 90, 2, 90);
		
		// print initial marks
		System.out.println("Student 1 initial marks: " + stu1.getMarks());
		System.out.println("Student 2 initial marks: " + stu2.getMarks());
		
		// increase marks if attendance if more than 75%
		if(stu1.getAttendance() > 75) {
			double initialMarks = stu1.getMarks();
			stu1.setMarks(initialMarks + (0.1*initialMarks));
		}
		if(stu2.getAttendance() > 75) {
			double initialMarks = stu2.getMarks();
			stu2.setMarks(initialMarks + (0.1*initialMarks));
		}
		
		// print final marks
		System.out.println("Student 1 final marks: " + stu1.getMarks());
		System.out.println("Student 2 final marks: " + stu2.getMarks());
	}
}
