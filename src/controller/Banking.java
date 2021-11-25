package controller;

import model.Customer;
abstract class Banking {
	
	abstract void createAccount();
	abstract void loginAccount();
	abstract void services(Customer account);
	
}



