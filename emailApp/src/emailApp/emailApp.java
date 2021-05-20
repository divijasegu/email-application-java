package emailApp;

public class emailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email emp1 = new Email("segu","divija");
		emp1.setAlternate("js@gmail.com");
		System.out.println("your new email is:" + emp1.getAlternateEmail());
		System.out.println(emp1.showInfo());
	
		

	}

}