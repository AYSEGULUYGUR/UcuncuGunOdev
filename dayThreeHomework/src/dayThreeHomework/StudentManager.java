package dayThreeHomework;

public class StudentManager extends UserManager{
	public void submit(Student student) { 
		System.out.println(student.getName()+ " �devini ekledin.");
	}
	 public void uptade(Student student) {
		 System.out.println(student.getName()+ " �devini g�ncelledin!");
	 }
	 public void delete(Student student) {
		 System.out.println(student.getName()+ " �devini sildin!");
	 }
	

}
