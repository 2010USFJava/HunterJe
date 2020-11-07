package com.revature.services;

import java.util.Scanner;

import com.revature.menu.MainMenu;
import com.revature.project0.Customer;
import com.revature.util.FileStuff;
import com.revature.util.LogThis;

public class BankMenu extends Customer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8393473984502695237L;

	static Scanner scan= new Scanner(System.in);
	static {FileStuff.readCustomerFile();}
	private double balance;
	
	
	public static void depositMenu() {
		System.out.println("Enter Deposit Amount: ");
		double amount = scan.nextDouble();
		if(amount >=0 ) {
			balance +=amount;
			System.out.println("Deposit Successful!");
		}else {
			System.out.println("Invalid Entry! Please Try Again.");
		}
		LogThis.LogIt("info"," Your new balance is "+ balance);
		
		System.out.println("Would you like to make another deposit? (y/n)");
		String choice1 = scan.next();
		if (choice1.equalsIgnoreCase("y")) {
			depositMenu();
		}else if (choice1.equalsIgnoreCase("n")) {
			System.out.println("Returning to account menu.");
			MainMenu.accountMenu();
		}else {
			System.out.println("Returning to the main menu");
			MainMenu.mainMenu();
		}
	}
	
	public static void withdrawMenu() {
		System.out.println("Enter Withdrawal Amount: ");
		String choice = scan.nextLine();
		double amount = scan.nextDouble();
		if(amount >=0 && balance > amount) {
			balance -=amount;
			System.out.println("Withdrawl Successful!");
		}else {
			System.out.println("Insufficient Funds!");
		}
		LogThis.LogIt("info"," Your new balance is "+ balance);
		
		System.out.println("Would you like to make another withdrawal? (y/n)");
		String choice1 = scan.next();
		if (choice1.equalsIgnoreCase("y")) {
			withdrawMenu();
		}else if (choice1.equalsIgnoreCase("n")) {
			System.out.println("Returning to account menu.");
			MainMenu.accountMenu();
		}else {
			System.out.println("Returning to the main menu");
			MainMenu.mainMenu();
		}
	}
	
	public static void transferMenu() {
		System.out.println("Enter Transfer Amount: ");
		String choice = scan.nextLine();
		double amount = scan.nextDouble();
		if(amount <= balance ) {
			balance -=amount;
			SavingsAcct.balance +=amount;
			System.out.println("Transfer Successful!");
			LogThis.LogIt("info","Current Account balance is "+ balance);
			LogThis.LogIt("info","Savings Account balance is "+ SavingsAcct.balance);
		}else {
			System.out.println("Insufficient Funds!");
		}
		
		System.out.println("Would you like to make another withdrawal? (y/n)");
		String choice1 = scan.next();
		if (choice1.equalsIgnoreCase("y")) {
			withdrawMenu();
		}else if (choice1.equalsIgnoreCase("n")) {
			System.out.println("Returning to account menu.");
			MainMenu.accountMenu();
		}else {
			System.out.println("Returning to the main menu");
			MainMenu.mainMenu();
		}
	}

	public BankMenu() {
		super();

	}

	public BankMenu(String firstName, String lastName, String address, String username, String password) {
		super(firstName, lastName, address, username, password);
	}

	public double getBalance() {
		return balance;
	}

	@SuppressWarnings("static-access")
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}