package dayThreeHomework;

public class StudentManager extends UserManager{
	public void submit(Student student) { 
		System.out.println(student.getName()+ " ödevini ekledin.");
	}
	 public void uptade(Student student) {
		 System.out.println(student.getName()+ " ödevini güncelledin!");
	 }
	 public void delete(Student student) {
		 System.out.println(student.getName()+ " ödevini sildin!");
	 }
	

}
