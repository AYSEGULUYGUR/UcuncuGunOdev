package dayThreeHomework;

public class InstructorManager extends UserManager{
	public void add(Instructor instructor) {
		System.out.println(instructor.getName() + " ödev öðrenciler için sisteme eklendi.!");
		
	}
	public void homeworkAdd(Student student) {
		System.out.println(student.getStudentNumber() + "numaralý öðrenci ödevini yükledi!");
	}


}
