package studentdb2;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable {
	private String studentNumber;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String course;
	private int yearLevel;
	private String crushName;
	private Course faveSubject;
	
	public Student(){}
	
	public Student(String studentNumber, String firstName, char middleInitial, String lastName, String course, int yearLevel, String crushName, Course faveSubject) {
		this.setStudentNumber(studentNumber);
		this.setFirstName(firstName);
		this.setMiddleInitial(middleInitial);
		this.setLastName(lastName);
		this.setCourse(course);
		this.setYearLevel(yearLevel);
		this.setCrushName(crushName);
		this.setFaveSubject(faveSubject);
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}

	public char getMiddleInitial() {
		return middleInitial;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}

	public int getYearLevel() {
		return yearLevel;
	}
	
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public String getCrushName() {
		return crushName;
	}
	
	public String toString() {
		String middle;
		if (middleInitial == (char)54321) { middle = "";}
		else {middle = String.valueOf(middleInitial);}
		return String.format("%s\n%s, %s %s\n%s\n%d\n%s\n%s", studentNumber, lastName, firstName, middle, course, yearLevel, crushName, faveSubject);
	}

	public Course getFaveSubject() {
		return faveSubject;
	}

	public void setFaveSubject(Course faveSubject) {
		this.faveSubject = faveSubject;
	}
	
}

