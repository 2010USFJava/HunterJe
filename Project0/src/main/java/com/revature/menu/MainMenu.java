package com.revature.menu;

import java.util.Scanner;

import com.revature.project0.Customer;
import com.revature.project0.Employee;
import com.revature.services.BankMenu;

public class MainMenu {
	static Scanner scan = new Scanner(System.in);
	
	
	public static void mainMenu() {
		System.out.println("Welcome to the Hunter Credit Union!");
		System.out.println("Please enter your slection from the options below:");
		System.out.println("\n\t[C]ustomer Login");
		System.out.println("\t[E]mployee/Admin Login");
		System.out.println("\t[A]pply for New Account");
		System.out.println("\n\t[Q]uit Application ");

		String choice = scan.nextLine();

		switch (choice.toUpperCase()) {
		case "C":
			userLogin();
			break;
			case "E":
				Employee.employeeLogin();
				break;
		case "A":
			createNewCustomer();
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

	public static void accountMenu() {
		System.out.println("Current Balance is "+ BankMenu.balance);
		System.out.println("Would you like to make a: ");
		System.out.println("\n\t[D]eposit");
		System.out.println("\t[T]ransfer Funds");
		System.out.println("\t[W]ithdrawal");
		System.out.println("\n\t[M]ain Menu ");

		String choice = scan.nextLine();
		switch (choice.toUpperCase()) {
		case "D":
			BankMenu.depositMenu();
			break;
//		case "T":
//			BankMenu.transferMenu();
//			break;
		case "W":
			BankMenu.withdrawMenu();
			break;
		case "M":
			System.out.println("Returning to the main menu");
			mainMenu();
			break;
		default:
			System.out.println("Invalid Entry. Please try again.");
			mainMenu();
			break;
		}
	}
		

	public static void createNewCustomer() {
		System.out.println("Enter your first name:");
		String firstName = scan.nextLine();

		System.out.println("Enter your last name:");
		String lastName = scan.nextLine();
		
		System.out.println("Enter your address name:");
		String address = scan.nextLine();

		System.out.println("Create a username:");
		String username = scan.nextLine();

		System.out.println("Create a password:");
		String password = scan.nextLine();

		Customer a = new Customer(firstName, lastName, address, username, password);
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

}
