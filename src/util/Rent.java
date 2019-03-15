package util;

public class Rent {

	private String student;
	private String email;
	
	// CONSTRUCT
	public Rent(String student, String email) {
		setStudent(student);
		setEmail(email);
	}
	
	//GET & SET
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	//ToString
	@Override
	public String toString() {
		return student + ", " + email ;
	}
	
}
