package com.revature.menu;

import java.util.Random;
import java.util.Scanner;

import com.revature.project0.Customer;
import com.revature.project0.Login;
import com.revature.util.LogThis;

public class MainMenu {
	private static final double amount = 0;
	static Scanner scan = new Scanner(System.in);
	private static double balance;
	private static double setBalance;
	private static double getBalance;

	public static void mainMenu() {
		System.out.println("Welcome to the Hunter Credit Union!");
		System.out.println("Please enter your slection from the options below:");
		System.out.println("\n\t[C]ustomer Login");
		System.out.println("\t[E]mployee/Admin Login");
		System.out.println("\t[A]pply for New Account");
		System.out.println("\t[D]eposit");
		System.out.println("\t[W]ithdrawal");
		System.out.println("\n\t[Q]uit Application ");

		String choice = scan.nextLine();

		switch (choice.toUpperCase()) {
		case "C":
			userLogin();
			break;
//			case "E":
//				employeeMenu();
//				break;
		case "A":
			createNewCustomer();
			break;
		case "D":
			depositMenu();
			break;
		case "W":
		//	withdrawMenu();
			break;
		case "Q":
			System.out.println("Thank you for using Hunter Credit Union!");
			break;
		default:
			System.out.println("Invalid Entry. Please try again.");
			mainMenu();
			break;
		}
	}

	public static void userLogin() {
		System.out.println("Enter Username:");
		String username = scan.nextLine();
		System.out.println("Enter Password:");
		String password = scan.nextLine();
		System.out.println("Login Successful");
		System.out.println("Would you like to see your account information? (y/n)");
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			accountMenu();
		} else if (choice.equalsIgnoreCase("n")) {
			System.out.println("Returning to main menu.");
			mainMenu();
		}
	}

	private static void accountMenu() {
		System.out.println("Current Balance is "+ getBalance());
		System.out.println("Would you like to make a: ");
		System.out.println("\n\t[D]eposit");
		System.out.println("\t[T]ransfer Funds");
		System.out.println("\t[W]ithdrawal");

		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("D")) {
			depositMenu();
//		} else if (choice.equalsIgnoreCase("T")) {
//			transferMenu();
//		} else if (choice.equalsIgnoreCase("W")) {
//			withdrawMenu();
		} else {
			System.out.println("Returning to the main menu");
			mainMenu();
		}
	}
	
	private static double getBalance() {
		balance = 300;
		return balance;
	}

	private static void depositMenu() {
		System.out.println("Enter Deposit Amount: ");
		String choice = scan.nextLine();
		balance = balance + amount;
		setBalance = balance;
		LogThis.LogIt("info"," Your new balance is "+ getBalance);
		
		System.out.println("Would you like to make another deposit? (y/n)");
		String choice1 = scan.nextLine();
		if (choice1.equalsIgnoreCase("y")) {
			depositMenu();
		}else if (choice1.equalsIgnoreCase("n")) {
			System.out.println("Returning to account menu.");
			accountMenu();
		}else {
			System.out.println("Returning to the main menu");
			mainMenu();
		}
	}
		
	
//	private static void transferMenu() {
//		
//	}
//
//	private static void withdrawMenu() {
//		
//	}

	public static void createNewCustomer() {
		System.out.println("Enter your first name:");
		String firstName = scan.nextLine();

		System.out.println("Enter your last name:");
		String lastName = scan.nextLine();

		System.out.println("Create a username:");
		String username = scan.nextLine();

		System.out.println("Create a password:");
		String password = scan.nextLine();

		System.out.println("Account Number will be generate for you.");
		Random accountNum = new Random();

		Customer a = new Customer(firstName, lastName, username, password, accountNum);
		LogThis.LogIt("info", a.getFirstName() + " was added to customer database.");
		System.out.println("Account created successfully, awaiting approval!");
		
		System.out.println("Would you like to see your account information? (y/n)");
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			accountMenu();
		} else if (choice.equalsIgnoreCase("n")) {
			System.out.println("Returning to main menu.");
			mainMenu();
		}

	}

//		public static void employeeMenu() {
//			System.out.println("\n\t[L]ogin");
//			System.out.println("\t[R]egister");
//			System.out.println("\t[V]iew Accounts");
//			System.out.println("\n\t[M]ain Menu ");
//			
//			String choice=scan.nextLine();
//			
//			switch(choice.toUpperCase()) {
//			case "L":
//				Login customerLogin = new Login();
//				System.out.println(customerLogin);
//				break;
//			case "R":
//				Register regCustomer = new Register();
//				System.out.println(regCustomer);
//				break;
//			case "V":
//				Account acctCustomer = new Account();
//				System.out.println(acctCustomer);
//				break;
//			case "M":
//				System.out.println("Return to Main Menu");
//				break;
//			default:
//				System.out.println("Invalid Entry. Please try again.");
//				mainMenu();
//				break;		
//			}
//		}
//	
}
