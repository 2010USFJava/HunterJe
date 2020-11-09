package com.revature.project0;

import java.util.Scanner;

import com.revature.menu.MainMenu;
import com.revature.util.Roster;

public class Admin extends Employee {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5464098717234548354L;
	static Scanner scan = new Scanner(System.in);

	public static void adminLogin() {
		System.out.println("Enter Username:");
		String username = scan.nextLine();
		System.out.println("Enter Password:");
		String password = scan.nextLine();
		if (username.equals("admin01") && (password.equals("al77"))) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Invalid entry. Please try again.");
			adminLogin();
		}

		System.out.println("Please choose from the options below:");
		System.out.println("\n\t[S]earch for Account");
		System.out.println("\t[A]ccounts for Approval");
		System.out.println("\t[R]eview Accounts for Deletion");
		System.out.println("\n\t[M]ain Menu ");

		String choice1 = scan.nextLine();
		switch (choice1.toUpperCase()) {
		case "S":
			Employee.searchDir();
			break;
		case "A":
			Employee.approval();
			break;
		case "R":
			adminDelete();
			break;	
		case "M":
			MainMenu.mainMenu();
			break;
		default:
			MainMenu.mainMenu();
			break;
		}
	}
	
	
	protected static void adminDelete() {
		System.out.println("Enter Account Holder's first name:");
		String firstName=scan.nextLine();
		Customer a= Roster.findCustomerByName(firstName);
		System.out.println("Account Found!");
		System.out.println(a.toString());
		
		System.out.println("Would you like to delete this account?");
		String choice=scan.nextLine();
		Roster.customerList.remove(a);
		if(choice.equalsIgnoreCase("y")) {////arrayList********* remove
			System.out.println("Account has been deleted. Customer will be notified.");
		}else if (choice.equals("n")) {
			Employee.empLogin();
		}else {
			System.out.println("Returning to the main menu");
			MainMenu.mainMenu();
		}
		
		System.out.println("Would you like to review another account? (y/n)");
		String choice1=scan.nextLine();
		if(choice1.equalsIgnoreCase("y")) {
			adminDelete();
		}else if (choice1.equalsIgnoreCase("n")) { // not sure about returning to adminlogin
			adminLogin();
		}else {
			System.out.println("Returning to main menu");
			MainMenu.mainMenu();
		}
	}

	
	
	public Admin() {
		super();
	}

}