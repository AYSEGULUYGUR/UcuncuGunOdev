package dayThreeHomework;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId()+" id li kullanýcý baþarý ile eklenmiþtir!");
	}
	
	public void login(User user) {
		System.out.println(user.getEmail()+ " Tebrikler! Sisteme giriþ yapýldý.");
	}
	
	

}
