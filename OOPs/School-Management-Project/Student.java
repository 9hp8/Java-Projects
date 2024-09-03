package student.management.system;

/*
 * Creating a first pojo student for keeping the track of student enrolled in the school.
 */

public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	private int grade;
	private int marks;
	private int feesPaid;
	private int feesTotal;
	
	public Student(int studentId, String firstName, String lastName,int grade){
		this.studentId=studentId;
		this.feesPaid =0;
		this.feesTotal=30000;
		this.firstName=firstName;
		this.lastName=lastName;
		this.grade = grade;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getgrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void updateFeespaid(int fees) {
		feesPaid += fees ;
	}
	
	
}
