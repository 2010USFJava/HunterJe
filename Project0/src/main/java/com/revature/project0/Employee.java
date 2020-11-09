package com.revature.project0;

import java.util.List;
import java.util.Scanner;

import com.revature.menu.MainMenu;
import com.revature.util.Roster;


public class Employee extends Customer{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2993881201093084158L;
	static Scanner scan = new Scanner(System.in);
	
	public static void employeeLogin() {
		System.out.println("Select your login:");
		System.out.println("\n\t[E]mployee Login");
		System.out.println("\t[A]dmin Login");
		System.out.println("\n\t[M]ain Menu ");
		
		String choice=scan.nextLine();
		
		switch(choice.toUpperCase()) {
		case "E":
			empLogin();
			break;
		case "A":
			Admin.adminLogin();
			break;
		case "M":
			System.out.println("Return to Main Menu");
			MainMenu.mainMenu();
			break;
		default:
			System.out.println("Invalid Entry. Please try again.");
			MainMenu.mainMenu();
			break;		
		}
	}
	
	protected static void empLogin() {
		System.out.println("Enter Username:");
		String username = scan.nextLine();
		System.out.println("Enter Password:");
		String password = scan.nextLine();
		if(username.equals("emp01") && (password.equals("al77"))) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Invalid entry. Please try again.");
			empLogin();
		}
		
		System.out.println("Please choose from the options below:");
		System.out.println("\n\t[S]earch for Account");
		System.out.println("\t[A]ccounts for Approval");
		System.out.println("\n\t[M]ain Menu ");

		String choice1 = scan.nextLine();
		switch (choice1.toUpperCase()) {
		case "S":
			searchDir();
			break;
		case "A":
			approval();
			break;
		case "M":
			MainMenu.mainMenu();
			break;
		default:
			MainMenu.mainMenu();
			break;
	}
}


	public static void searchDir() {
		System.out.println("Enter Account Holder's first name:");
		String firstName=scan.nextLine();
		Customer a= Roster.findCustomerByName(firstName);
		System.out.print("Account Found!");
		System.out.println(a.toString());
		
		System.out.println("Would you like to search for another account? (y/n)");
		String choice=scan.nextLine();
		if(choice.equalsIgnoreCase("y")) {
			searchDir();
		}else if (choice.equalsIgnoreCase("n")) {
			empLogin();
		}else {
			System.out.println("Returning to main menu");
			MainMenu.mainMenu();
		}
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	protected static void approval() {
		System.out.println("Enter Account Holder's first name:");
		String firstName=scan.nextLine();
		System.out.println("Account Found!");
		System.out.println(Roster.customerList.toString());
		System.out.println("This account is pendng approval:");
		String choice=scan.nextLine();
		boolean approved = true;
		boolean denied = false;
		if(choice.equalsIgnoreCase("approved")) {
			System.out.println("Account has been approved. Customer will be notified.");
		}else {
			System.out.println("Account has been denied. Customer will be notified.");
		}
		System.out.println("Would you like to approve for another account? (y/n)");
		String choice1=scan.nextLine();
		if(choice1.equalsIgnoreCase("y")) {
			approval();
		}else if (choice1.equalsIgnoreCase("n")) { 
			Employee.employeeLogin();
		}else {
			System.out.println("Returning to main menu");
			MainMenu.mainMenu();
		}
	}
	public Employee() {
		super();
	}
}