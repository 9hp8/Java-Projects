package student.management.system;

import java.util.ArrayList;
import java.util.List;

public class School {

	// private Teacher[] teacher = new Teacher();
	private List<Student> students = new ArrayList<>();
	private List<Teacher> teachers = new ArrayList<>();
	private int totalEarner;
	private int totalspent;

	public School(List<Student> student, List<Teacher> teacher, int totalEarner, int totalspent) {
		super();
		this.students = student;
		this.teachers = teacher;
		this.totalEarner = 0;
		this.totalspent = 0;
	}

	// returns the list if students in the school
	public List<Student> getStudent() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	// returns the list if teachers in the school
	public List<Teacher> getTeacher() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public int getTotalEarner() {
		return totalEarner;
	}

	public void updateTotalEarner(int moneyEarner) {
		totalEarner += moneyEarner;
	}

	public int getTotalspent() {
		return totalspent;
	}

	public void updateTotalspent(int moneySpent) {
		totalEarner -= moneySpent;
	}

}
