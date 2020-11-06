package com.revature.services;

import java.util.Scanner;

import com.revature.menu.MainMenu;
import com.revature.util.LogThis;

public class BankMenu {
	static Scanner scan= new Scanner(System.in);
	
	private String custName;
	private int acctNumber;
	public static double balance;
	
	
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
	
	public BankMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankMenu(String custName, int acctNumber, double initialBalance) {
		super();
		this.custName = custName;
		this.acctNumber = acctNumber;
		this.balance = initialBalance;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(int acctNumber) {
		this.acctNumber = acctNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankMenu [custName=" + custName + ", acctNumber=" + acctNumber + ", balance=" + balance + "]";
	}
	
	
	
	
	
}



