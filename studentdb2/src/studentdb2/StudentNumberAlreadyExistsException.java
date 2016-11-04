package studentdb2;

public class StudentNumberAlreadyExistsException extends Exception {
	String studentNumber;

	public StudentNumberAlreadyExistsException(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	String getInfo() {
		return "Student number " + studentNumber + " already exists.";
	}
}
