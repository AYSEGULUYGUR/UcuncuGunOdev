package dayThreeHomework;

public class InstructorManager extends UserManager{
	public void add(Instructor instructor) {
		System.out.println(instructor.getName() + " �dev ��renciler i�in sisteme eklendi.!");
		
	}
	public void homeworkAdd(Student student) {
		System.out.println(student.getStudentNumber() + "numaral� ��renci �devini y�kledi!");
	}


}
