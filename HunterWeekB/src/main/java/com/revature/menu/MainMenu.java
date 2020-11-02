package com.revature.menu;

import java.util.Scanner;


import com.revature.util.LogThis;
import com.revature.util.Roster;
import com.revature.weekb.Student;

public class MainMenu {
	static Scanner scan = new Scanner(System.in);
	
	public static void mainMenu() {
		System.out.println("Welcome to Hunter University!");
		System.out.println("Please enter your slection from the options below:");
		System.out.println("\n\t[1]Admin Login");
		System.out.println("\t[2]Search Student Directory");
		System.out.println("\t[3]Quit Application");
		
		String choice = scan.nextLine();
	
		switch (choice.toUpperCase()) {
			case "1":
				adminLogin();
				break;
			case "2":
				searchDir();
				break;
			case "3":
				System.out.println("Thank you for choosing Hunter University!");
				break;
			default:
				System.out.println("Invalid Entry. Please try again.");
				mainMenu();
				break;
			}
		}


	public static void adminLogin() {
		System.out.println("Enter Username:");
		String username = scan.nextLine();
		System.out.println("Enter Password:");
		String password = scan.nextLine();
		if(username.equals("jhunter77") && (password.equals("al77"))) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Invalid entry. Please try again.");
			adminLogin();
		}
		
		System.out.println("Would you like to add a student to the directory? (y/n)");
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			studentDir();
		} else if (choice.equalsIgnoreCase("n")) {
			System.out.println("Returning to main menu.");
			mainMenu();
		}
	}
		

	public static void studentDir() {
		System.out.println("Please enter student's first name:");
		String firstName= scan.nextLine();
		System.out.println("Please enter student's last name:");
		String lastName= scan.nextLine();
		System.out.println("Please enter student's ID number:");
		int studentID= Integer.parseInt(scan.nextLine());
		System.out.println("Please enter student's grade level:");
		String grade= scan.nextLine();
		
		Student a= new Student(firstName, lastName, studentID, grade);
		LogThis.LogIt("info", a.getFirstName() + " was added to directory!");
		//System.out.println(Roster.studentList.toString());
		
		System.out.println("Would you like to add another student? (y/n)");
		String choice=scan.nextLine();
		if(choice.equalsIgnoreCase("y")) {
			studentDir();
		}else if (choice.equalsIgnoreCase("n")) {
			mainMenu();
		}else {
			System.out.println("Returning to main menu");
			mainMenu();
		}
	}
	
	public static void searchDir() {
		System.out.println("Enter student's first name:");
		String firstName=scan.nextLine();
		Student s1= Roster.findStudentByName(firstName);
		System.out.println("Student Found!");
		System.out.println(Roster.findStudentByName(firstName));
		
		System.out.println("Would you like to search another student? (y/n)");
		String choice=scan.nextLine();
		if(choice.equalsIgnoreCase("y")) {
			searchDir();
		}else if (choice.equalsIgnoreCase("n")) {
			mainMenu();
		}else {
			System.out.println("Returning to main menu");
			mainMenu();
		}
		
	}
		
	

	

}
