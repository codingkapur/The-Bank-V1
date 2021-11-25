package controller;

import model.Customer;

import java.util.Scanner;

import accounts.AccountsBook;

public class Account extends Banking {
		
	Scanner input = new Scanner(System.in);
	//CREATE A NEW LINKEDLIST FOR STORING ACCOUNTS:
	AccountsBook accountsList1 = new AccountsBook();
	
	//CREATE A NEW ACCOUNT AND ADD TO ACCOUNTS BOOK
	public void createAccount(){
		
		System.out.println("Thank you for choosing Indian Bank. Let's get started with creating your account!");
		System.out.println("Please enter a desired Account Number: ");
		String accountNumber = input.next();
		
		System.out.println("Please enter your password.");
		String password;
		do {
			System.out.println("Password must contain a minium of 8 characters!");
			password = input.next();
			
		} while(password.length()<8);
		
		
		Customer c = new Customer(accountNumber, password);
		accountsList1.addAccountLast(c);
		accountsList1.printList();
	}
	
	//LOGIN
	public void loginAccount(){
		System.out.println("Hi! Welcome to Indian Bank's online banking service.");
		System.out.println("Please enter your Account Number: ");
		//TAKE INPUT
		String accountNumber = input.next();
		//SEARCH FOR ACCOUNT
		if(accountsList1.searchAccount(accountNumber) != null) {
			Customer account = accountsList1.searchAccount(accountNumber);
			System.out.println("Please enter your password: ");
			String password = input.next();
			//IF ACCOUNT FOUND, MATCH PASSWORD
			if(password.equals(account.getPassword())) {
				System.out.println("Login Successful!");
				services(account);
			}
			else {
				System.out.println("Incorrect Password");
			}
		}
		//IF ACCOUNT NOT FOUND
		else {
			System.out.println("No account with this Account Number exists!");
			}
		
	}
		
	//SERVICES PORTAL
	public void services(Customer account){
		//CREATE OBJECT OF SERVICE - GET ACCESS TO FUNCTIONS DEFINED WITHIN
		Service serviceList = new Service();
		int opt2;
		System.out.println("--------------------------------");
		System.out.println("Let's Begin Banking Operations!");
		System.out.println("--------------------------------");
		
		do {
			
			System.out.println("1. Withdraw Amount");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Transfer Amount");
			System.out.println("4. Print Balance");
			System.out.println("0. Exit");
			//TAKE INPUT
			opt2 = input.nextInt();
			//FOR WITHDRAWAL
			if(opt2 == 1) {
				serviceList.withdrawAmount(account);
			}
			//FOR DEPOSIT
			else if(opt2 == 2) {
				serviceList.depositAmount(account);
			}
			//FOR TRANSFER
			else if(opt2 == 3) {
				serviceList.transferAmount(account, accountsList1);
			}
			//FOR PRINT BALANCE
			else if(opt2 == 4) {
				serviceList.printBalance(account);
			}
			//FOR EXIT
			else if (opt2==0) {
				break;
			}
			//DEFAULT CASE
			else {
				System.out.println("Invalid Option. Try Again!");
			}
		} while (opt2 != 0);
		
		System.out.println("Thank you for banking with us! We hope to see you soon! You are now being redirected to the main window!");
		return;
	}
}