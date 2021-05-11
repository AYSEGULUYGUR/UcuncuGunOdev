package dayThreeHomework;

public class Student extends User {
	private String name;
	private String lastName;
	private String studentNumber;
	
	public Student() {
		
	}
	
	public Student(String name, String lastName, String studenMuber) {
		this.setName(name);
		this.setLastName(lastName);
		this.setStudentNumber(studenMuber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	

}
