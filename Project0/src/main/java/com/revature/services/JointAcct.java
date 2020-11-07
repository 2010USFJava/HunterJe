package com.revature.services;

import java.util.Scanner;

import com.revature.menu.MainMenu;
import com.revature.project0.Customer;

public class JointAcct {
	static Scanner scan= new Scanner(System.in);
	
	private String firstName;
	private String lastName;
	private String secFirstName;
	private String secLastName;
	private String address;
	private String username;
	private String password;
	protected static double balance;
	
	
	public static void jointAcct() {
		System.out.println("Enter Primary Account Holder's name:");
		String firstName = scan.nextLine();
		System.out.println("Enter Primary Account Holder's last name:");
		String lastName = scan.nextLine();
		System.out.println("Enter Secondary Account Holder's name:");
		String secFirstName = scan.nextLine();
		System.out.println("Enter Secondary Account Holder's last name:");
		String secLastName = scan.nextLine();
		System.out.println("Enter your address name:");
		String address = scan.nextLine();
		System.out.println("Create a username:");
		String username = scan.nextLine();
		System.out.println("Create a password:");
		String password = scan.nextLine();
		System.out.println("Please enter initial deposit:");
		double balance = Double.parseDouble(scan.nextLine());

		JointAcct a = new JointAcct(firstName, lastName, secFirstName, secLastName, address, username, password, balance);
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
	
	public JointAcct() {
		super();
	}


	public JointAcct(String firstName, String lastName, String secFirstName, String secLastName, String address,
			String username, String password, double balance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.secFirstName = secFirstName;
		this.secLastName = secLastName;
		this.address = address;
		this.username = username;
		this.password = password;
		JointAcct.balance = balance;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getSecFirstName() {
		return secFirstName;
	}


	public void setSecFirstName(String secFirstName) {
		this.secFirstName = secFirstName;
	}


	public String getSecLastName() {
		return secLastName;
	}


	public void setSecLastName(String secLastName) {
		this.secLastName = secLastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public static double getBalance() {
		return balance;
	}


	public static void setBalance(double balance) {
		JointAcct.balance = balance;
	}


	@Override
	public String toString() {
		return "JointAcct [firstName=" + firstName + ", lastName=" + lastName + ", secFirstName=" + secFirstName
				+ ", secLastName=" + secLastName + ", address=" + address + ", username=" + username + ", password="
				+ password + ", balance=" + balance + "]";
	}
	
	
}
