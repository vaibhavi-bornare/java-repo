

import java.util.Scanner;

class Bank {
	private String accountHolder;
	private long accountNumber;
	private int pin;
	private double balance;
	
	// constructor
	public Bank(String accountHolder, long accountNumber, int pin, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = balance;
	}
	
	// authentication
	public boolean authentication(long enteredAccountNumber , int enteredpin) {
		return 
		accountNumber == enteredAccountNumber 
		&& 
		pin == enteredpin;
	}
	
	// to check balance
	public void checkBalance() {
		System.out.println("Available Balance: Rs. "  +balance);
	}
	
	// to deposit amount
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Amount !Enter amount above zero");
			return ;
		}
		balance += amount;
		System.out.println("Amount Deposit Successfully!");
		System.out.println("Deposited Rs. "  + amount);
		checkBalance();
	}
	
	
	// to withdraw amount
	public void withdraw(double amount) {
		 if((amount > 0)&& (amount <balance)) {
			   balance -= amount;
			    System.out.println("Amount withdaw Successfully!");
		   }
		 
		   System.out.println("wthdraw Rs" +amount);
			checkBalance();
	   }
	
	
	// to Show Account Details 
	public void showAccountDetails() {
		System.out.println("\n -------ACCOUNT DETAILS--------");
		System.out.println("Account Holder : "  +accountHolder);
		System.out.println("Account Number : " + accountNumber);
		checkBalance();
	}
}



public class BankAccountDetails {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bank account = null;
		
		int choice;
		do {
			System.out.println("\n ===== SBI BANK =====");
			System.out.println("1. CREATE ACCOUNT");
			System.out.println("2. LOGIN");
			System.out.println("3 .Deposit");
			System.out.println("4.Withdrw");
			System.out.println("5. EXIT");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				if(account != null) {
					System.out.println("Alreday Have Account ");
					break;
				}
			System.out.println("Enter account Holder name: ");	
			String name = sc.next();
			
			System.out.println("Enter account Number: ");	
			long accNo = sc.nextLong();
			
			System.out.println("Enter 4 digit pin: ");
			int pin = sc.nextInt();
			
			System.out.println("Enter opening balance minimum rs. 0");
			
			double openingBalance = sc.nextDouble();
			
			account = new Bank(name, accNo, pin, openingBalance);
			break;
			}
			
			case 2: {
				System.out.println("Enter Account Number: ");
				long accNo = sc.nextLong();
				
				System.out.println("Enter Pin: ");
				int pin = sc.nextInt();
				boolean  result = account.authentication(accNo, pin);
				if(result) {
					System.out.println("Login Successful");
				}
				else {
					System.err.println("Invalid accNo or Pin");
				}
				break;
			}
			
			case 3:{
				if (account == null) {
			        System.out.println("Please create account first.");
			        break;
			    }

			    System.out.println("Enter amount to deposit:");
			    double amount = sc.nextDouble();

			    account.deposit(amount);

			    break;
			}
			case 4: {
			
			    if (account == null) {
			        System.out.println("Please create account first.");
			        break;
			    }

			    System.out.println("Enter amount to withdraw:");
			    double amount = sc.nextDouble();

			    account.withdraw(amount);

			    break;
			}
				
			
			default:
				System.out.println("Case not valid");
			}
		}
		while(choice != 5);
	}
	

}