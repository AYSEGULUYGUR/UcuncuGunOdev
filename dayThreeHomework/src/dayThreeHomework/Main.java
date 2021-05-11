package dayThreeHomework;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setName("Bahadır");
		instructor.setLastName("Yayla");
		instructor.setInstructorId("123");
		instructor.setEmail("bypareva@gmail.com");
		
		Student student = new Student();
		student.setId(2);
		student.setName("Ayşegül");
		student.setLastName("Uyğur");
		student.setEmail("aysgluygrrr@gmail.com");
		student.setStudentNumber("1812030200");
		
		UserManager userManager = new UserManager(); 
		userManager.add(student);
		userManager.add(instructor);
		userManager.login(student);
		userManager.login(instructor);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.homeworkAdd(student);
		instructorManager.add(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.submit(student);
		studentManager.uptade(student);
		studentManager.delete(student);
		
		

	}

}
