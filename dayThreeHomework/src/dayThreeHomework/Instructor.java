package dayThreeHomework;

public class Instructor extends User{
	private String name;
	private String lastName;
	private String �nstructorId;
	
	public Instructor() {
		
	}
	
	public Instructor(String name, String lastName, String �nstructorId) {
		this.setName(name);
		this.setLastName(lastName);
		this.setInstructorId(�nstructorId);
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

	public String getInstructorId() {
		return �nstructorId;
	}

	public void setInstructorId(String instructorId) {
		�nstructorId = instructorId;
	}
}


