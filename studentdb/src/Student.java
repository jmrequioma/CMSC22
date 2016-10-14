
public class Student {
	private String studentNumber;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String course;
	private int yearLevel;
	
	public Student(){}
	
	public Student(String studentNumber, String firstName, char middleInitial, String lastName, String course, int yearLevel) {
		this.setStudentNumber(studentNumber);
		this.setFirstName(firstName);
		this.setMiddleInitial(middleInitial);
		this.setLastName(lastName);
		this.setCourse(course);
		this.setYearLevel(yearLevel);
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
	
	public String toString() {
		String middle;
		if (middleInitial == (char)54321) { middle = "";}
		else {middle = String.valueOf(middleInitial);}
		return String.format("%s\n%s, %s %s\n%s\n%d\n", studentNumber, lastName, firstName, middle, course, yearLevel);
	}
	
}
