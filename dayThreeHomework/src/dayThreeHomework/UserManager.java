package dayThreeHomework;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId()+" id li kullan�c� ba�ar� ile eklenmi�tir!");
	}
	
	public void login(User user) {
		System.out.println(user.getEmail()+ " Tebrikler! Sisteme giri� yap�ld�.");
	}
	
	

}
