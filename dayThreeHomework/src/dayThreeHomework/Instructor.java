package dayThreeHomework;

public class Instructor extends User{
	private String name;
	private String lastName;
	private String żnstructorId;
	
	public Instructor() {
		
	}
	
	public Instructor(String name, String lastName, String żnstructorId) {
		this.setName(name);
		this.setLastName(lastName);
		this.setInstructorId(żnstructorId);
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
		return żnstructorId;
	}

	public void setInstructorId(String instructorId) {
		żnstructorId = instructorId;
	}
}


