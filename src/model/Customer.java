package model;
//DEFINE THE CUSTOMER CLASS
public class Customer {
	//EVERY OBJECT OF CUSTOMER WILL CONTAIN:
	private String accountNumber;
	private String password;
	private int balance = 0;
	//A PARAMETERIZED CONSTRUCTOR FOR NEW CUSTOMER OBJECTS
	public Customer(String accountNumber, String password){
		
		System.out.println("Creating a new account. Please hold!");
		
		setAccountNumber(accountNumber);
		setPassword(password);
		
		System.out.println("New Account Created! Welcome!");
		System.out.println("Your Account Number is: " + accountNumber+"\nYour Pasword: " + password );
	}
	
	//GETTER AND SETTER METHODS FOR ACCESSING PRIVATE DATA FIELDS.
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int amount) {
		this.balance = amount;
	}
}
