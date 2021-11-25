package accounts;

import model.Customer;
//CREATE A LINK LIST
public class AccountsBook {
	//DEFINE THE NODES IN THE LINK LIST
	class Node {
		Customer acc;
		Node next;
		
		Node(Customer acc){
			this.acc = acc;
			this.next = null;
		}
	}
	//KEEP TRACK OF THE HEAD. IN THE BEGINNING, IT WILL NOT HOLD ANY ELEMENT.
	Node head;
	//ADDING AN ACCOUNT IN THE END
	public void addAccountLast(Customer account) {
		Node newAccount = new Node(account);
		if(head==null) {
			head = newAccount;
			return;
		}
		Node currAccount = head;
		while(currAccount.next != null) {
			currAccount = currAccount.next;
		}
		currAccount.next = newAccount;
	}
	//ADDING AN ACCOUNT IN THE BEGINNING
	public void addAccountFirst(Customer account) {
		Node newAccount = new Node(account);
		if(head==null) {
			head = newAccount;
		}
		newAccount = head;
		head=head.next;
	}
	//SEARCHING FOR AN ACCOUNT
	public Customer searchAccount(String accountNumber) {
		Node currAccount = head;
		while(currAccount != null) {
			if(currAccount.acc.getAccountNumber().equals(accountNumber)) {
				return currAccount.acc;
			}
			currAccount = currAccount.next;
		}
		return null;
	}
	//PRINT LIST OF ACCOUNTS
	public void printList() {
		if(head==null) {
			System.out.println("There are no account in the accounts book.");
		}
		Node currAccount = head;
		while(currAccount != null) {
			System.out.print(currAccount.acc + " --> ");
			currAccount = currAccount.next;
		}
		System.out.print("NULL");
		System.out.println();
	}
	
}
