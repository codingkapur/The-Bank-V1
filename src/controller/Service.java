package controller;

import java.util.Scanner;

import accounts.AccountsBook;
import model.Customer;

public class Service{
	
	Scanner scan = new Scanner(System.in);
	
	//WITHDRAW AMOUNT FUNCTION
	public void withdrawAmount(Customer a) {
		System.out.println("How much would you like to withdraw?");
		int amount = scan.nextInt();
		if(amount > a.getBalance()) {
			System.out.println("Insufficient funds!");
			return;
		}
		else {
			a.setBalance(a.getBalance()-amount);
			System.out.println(amount +" withdrawn!");
			System.out.println("Remaining Balance is " + a.getBalance());
		}
		return;
	}
	//DEPOSIT AMOUNT FUNCTION
	public void depositAmount(Customer a) {
		System.out.println("How much would you like to deposit?");
		int amount = scan.nextInt();
		
		a.setBalance(a.getBalance()+amount);
		System.out.println(amount +" deposited!");
		System.out.println("Total Balance is " + a.getBalance());
		return;
	}
	//TRANSFER AMOUNT FUNCTION
	public void transferAmount(Customer a, AccountsBook accountsList1) {
		System.out.println("How much would you like to transfer?");
		int amount = scan.nextInt();
		if(amount > a.getBalance()) {
			System.out.println("Insufficient funds!");
			return;
		}
		System.out.println("Account number of transferee?");
		String transferee = scan.next();
		if(accountsList1.searchAccount(transferee) != null) {
			Customer transfereeAccount = accountsList1.searchAccount(transferee);
			a.setBalance(a.getBalance()-amount);
			transfereeAccount.setBalance(transfereeAccount.getBalance()+ amount);
			System.out.println(amount +" transferred! to account number " + transferee);
			System.out.println("Remaining Balance is " + a.getBalance());
			return;
			
		}
		else {
			System.out.println("This account does not exist.");
		}
		
		return;
	}
	//PRINT BALANCE FUNCTION
	public void printBalance(Customer a) {
		System.out.println("------------------------------------");
		System.out.println("Your Current Balance is " + a.getBalance());
		System.out.println("------------------------------------");
		return;
	}
	
}	
