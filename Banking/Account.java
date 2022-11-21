package Banking;
import java.util.Scanner;

public class Account{

	
	
	// Account class variables
	
	int balance;
	int previousTransaction;
	String CustomerName;
	String CustomerID;
	
	// class constructor 
	
		Account(String customerName, String customerID){
			
			
		}
		
		// void Function for Transactions
		
		

		void deposit(int amount) {
			if(amount != 0) {
				balance = balance + amount;
				previousTransaction = amount;
				
			}}
		
		// void function for Transaction Withdrawal
		
		void withdraw(int amount) {
			if(amount !=0) {
				balance = balance - amount;
				previousTransaction = -amount;
				
				
			}
		}
		
		void getPreviousTransaction() {
			if(previousTransaction > 0) {
				System.out.println("Deposited: " + previousTransaction);
				
				
			}
			else if (previousTransaction < 0) {
				System.out.println("Withdraw: " + Math.abs(previousTransaction));
				
			}
			else {
				System.out.println("No Transaction Occurred");
				
				
			}
		}
		
		void calculateInterest(int years) {
			double interestRate = 0.149;
			double newBalance = (balance + interestRate * years) + balance;
			System.out.println("The current interest rate is" + (100 * interestRate) + "%");
			System.out.println("After " + years + "years, your balance will be: " + newBalance);
			
			
		}
		
		void ShowMenu() {
			
			char option = '\0';
			Scanner Scanner = new Scanner(System.in);
			System.out.println("Welcome: " + (CustomerName) + "  CustomerName ");
			System.out.println("Your ID is: " + (CustomerID) + " CustomerID");
			System.out.println();
			 
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("A. CHECK YOUR BALANCE");
			System.out.println("B. MAKE A DEPOSIT");
			System.out.println("C. MAKE A WITHDRAWAL");
			System.out.println("D. VIEW PREVIOUS TRANSACTION");
			System.out.println("F. EXIT PROGRAM");
			
			
			do {
				System.out.println();
				System.out.println("ENTER OPTION :");
				char option1 = Scanner.next().charAt(0);
				option = Character.toUpperCase(option1);
				System.out.println();
				
				switch(option) {
				
				case 'A':
					System.out.println("=========================");
					System.out.println("BALANCE = $" + balance);
					System.out.println("=========================");
					System.out.println();
					break;
					
				case 'B':
					System.out.println("ENTER AN AMOUNT TO DEPOSIT");
					int amount = Scanner.nextInt();
					deposit(amount);
					System.out.println();
					break;
					
					
				case 'C':
					System.out.println("ENTER AN AMOUNT TO WITHDRAW");
					int amount2 = Scanner.nextInt();
					withdraw(amount2);
					System.out.println();
					break;
					
				case 'D':
					System.out.println("=========================");
					getPreviousTransaction();
					System.out.println("=========================");
					System.out.println();
					break;
					
				case 'E':
					
					System.out.println("ENTER HOW MANY YEARS OF INTEREST: ");
					int year = Scanner.nextInt();
					calculateInterest(year);
					break;
					
				case 'F':
					System.out.println("--------------------------");
					break;
					default:
						System.out.println("ERROR: INVALID OPTION. PLEASE ENTER OPTIONS: A, B, C, D, E, F");
						break;
					
				}
				
			}while (option != 'F');
			System.out.println("THANK YOU FOR YOUR BANKING WITH US");
		
		}

	
		}
		

		

	
	