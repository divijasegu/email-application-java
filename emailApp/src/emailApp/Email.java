package emailApp;

import java.util.Scanner;

public class Email {
	
	private static String Email = null;
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private String companySuffix = "dvicompany.com";
	private int mailboxCapacity;
	private String alternateEmail;
	
	
	//constructors to recieve first name and last name
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	 // System.out.println("EMAIL CREATED:" +" " +  this.firstName + " "  + this.lastName);
	  
	  //constructor for department
	  this.department = setDepartment();
	 // System.out.println("Department:"+this.department);
	  
	  //call a method for generating password 
	  this.password = RandomPassword(defaultPasswordLength);
	  //System.out.println("Your Password is:" + password);
	  
	  //combine elemenets to geneerate email
	   Email = firstName.toLowerCase()  + lastName.toLowerCase() + "@" + department + "." + companySuffix ;
	 // System.out.println("your email is:" + Email);
	  
	  
	  
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("ENter the Department code \n1 for sales\n2 for accounting\n3 for accounting \0 for none\nEnter department code:");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if(depChoice == 1) {return "Sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) { return "acct";}
		else { return "";}
		
	}
  
	//Genaerate the password
	private static String RandomPassword(int length) {
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
		char[] password = new char[length];
		for(int i = 0;i<length;i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
		
     }
	//set mailbox capacity 

   	 //change password
	public void changePassword(String password) {
		this.password = password;
		
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternate(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return ("DISPLAY NAME:" + firstName + " "+ lastName +
				"COMPANY EMAIL:" + Email + "MAILBOX CAPACITY:" + mailboxCapacity +  "mb");
	}
}

