package main;

//Library Imports
import java.util.Scanner;

import controller.Account;

public class Driver{
	
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		Account acc = new Account();
		System.out.println("Welcome to the Indian Bank! We have been in operation since 1900 and our proud to offer you our services!");
		
		int opt1;
		//Before checking for a base case, do this:
		do {
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("Please press the corresponding number of the service you would like to proceed with.");
			System.out.println("1. Create an Account");
			System.out.println("2. Login");
			System.out.println("0. Exit");
			System.out.println("-------------------------------------------------------------------------------------");
			
			
			opt1 = scan.nextInt();
			
			switch (opt1) {
			case 1: 
				acc.createAccount();
				break;
			case 2:
				acc.loginAccount();
				break;
			case 0:
				break;
			default:
				System.out.println("Please enter a valid input");
				break;
			}
		} while(opt1 != 0); //Do the above only while this condition holds true.
		
		//When input is 0:
		System.out.println("Exited successfully! Thank you for choosing Indian Bank.");
		
		scan.close();
	}
}
