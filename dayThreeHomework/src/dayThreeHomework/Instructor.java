package dayThreeHomework;

public class Instructor extends User{
	private String name;
	private String lastName;
	private String ýnstructorId;
	
	public Instructor() {
		
	}
	
	public Instructor(String name, String lastName, String ýnstructorId) {
		this.setName(name);
		this.setLastName(lastName);
		this.setInstructorId(ýnstructorId);
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
		return ýnstructorId;
	}

	public void setInstructorId(String instructorId) {
		ýnstructorId = instructorId;
	}
}


