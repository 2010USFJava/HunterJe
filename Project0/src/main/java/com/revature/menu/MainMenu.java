package com.revature.menu;

import java.util.Scanner;
import java.util.ArrayList;

import com.revature.project0.Customer;
import com.revature.project0.Employee;
import com.revature.services.BankMenu;
import com.revature.services.JointAcct;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class MainMenu {

	static Scanner scan = new Scanner(System.in);
	static {FileStuff.readCustomerFile();}

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
			System.out.print("Thank you for using Hunter Credit Union!");
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
		if(Roster.findCustomerByUsername(username) != null && Roster.findCustomerByPassword(password) !=null) {
			System.out.println("Successful Login!");
		}else {
			System.out.println("Invalid entry. Please try again.");
			userLogin();
		}
		
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
		System.out.println("Current Balance is " + Customer.getBalance());
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
		case "T":
			BankMenu.transferMenu();
			break;
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
		System.out.println("Would you like to make a: y/n");
		System.out.println("\n\tJoint Account");
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			JointAcct.jointAcct();
		} else if (choice.equalsIgnoreCase("n")) {
			regularAcct();
		}
	}
		public static void regularAcct() {
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
		System.out.println("Please enter initial deposit:");
		double balance = Double.parseDouble(scan.nextLine());

		Customer a = new Customer(firstName, lastName, address, username, password, balance);
		Roster.customerList.add(a);
		System.out.println(a.toString());	
		
		System.out.println("Would you like to see your account information? (y/n)");
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			MainMenu.accountMenu();
		} else if (choice.equalsIgnoreCase("n")) {
			System.out.println("Returning to main menu.");
			MainMenu.mainMenu();
		}
	}

	
}