package com.CodSoft.Task3;
import java.util.Scanner;
import com.CodSoft.Task3.ATM;
import com.CodSoft.Task3.BankAccount;
class BankAccount {
	    private double balance;	    
	    public BankAccount(double initialBalance) {
	        balance = initialBalance;
	    }	   
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } 
	        else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }	    
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);
	        } else if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount.");
	        } else {
	            System.out.println("Insufficient balance for this withdrawal.");
	        }
	    }	   
	    public double getBalance() {
	        return balance;
	    }
	}	
	class ATM {
	    private BankAccount bankAccount;
	    private Scanner scanner;	   
	    public ATM(BankAccount bankAccount) {
	        this.bankAccount = bankAccount;
	        this.scanner = new Scanner(System.in);
	    }	   
	    public void showMenu() {
	        System.out.println("\nATM Menu:");
	        System.out.println("1. Deposit");
	        System.out.println("2. Withdraw");
	        System.out.println("3. Check Balance");
	        System.out.println("4. Exit");
	        System.out.print("Choose an option (1-4): ");
	    }	    
	    public void interact() {
	        boolean running = true;
	        while (running) {
	            showMenu();
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    handleDeposit();
	                    break;
	                case 2:
	                    handleWithdrawal();
	                    break;
	                case 3:
	                    handleCheckBalance();
	                    break;
	                case 4:
	                    running = false;
	                    System.out.println("Thank you for using the ATM.");
	                    break;
	                default:
	                    System.out.println("Invalid option. Try again.");
	            }
	        }
	    }	   
	    private void handleDeposit() {
	        System.out.print("Enter amount to deposit: ");
	        double amount = scanner.nextDouble();
	        bankAccount.deposit(amount);
	    }	   
	    private void handleWithdrawal() {
	        System.out.print("Enter amount to withdraw: ");
	        double amount = scanner.nextDouble();
	        bankAccount.withdraw(amount);
	    }	    
	    private void handleCheckBalance() {
	        System.out.println("Current balance: $" + bankAccount.getBalance());
	    }
	}
 
public class ATMInterface {
	 public static void main(String[] args) {	       
	    	BankAccount userAccount = new BankAccount(1000);	       
	        ATM atm = new ATM(userAccount);	     
	        atm.interact();
	 }
}
