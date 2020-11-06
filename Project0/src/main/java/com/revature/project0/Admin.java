package com.revature.project0;

import java.util.Scanner;

import com.revature.menu.MainMenu;

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
		System.out.println("\t[A]pprove Accounts");
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

	

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

}