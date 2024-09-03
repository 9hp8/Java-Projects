package student.management.system;

/*
 * this clas is responsible for keeping track of the teach details
 */
public class Teacher {

	private int teacherId;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Teacher(int teacherId, String firstName, String lastName, int salary){
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getTeacherId() {
		return teacherId;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
