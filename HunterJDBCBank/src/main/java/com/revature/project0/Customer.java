package com.revature.project0;

import java.io.Serializable;
import java.util.Scanner;

import com.revature.util.FileStuff;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Customer implements Serializable{
	static Scanner scan= new Scanner(System.in);
	/**
	 * 
	 */
	private static final long serialVersionUID = -6203030530990934950L;
	//basic info
	private String firstName;
	private String lastName;
	private String address;
	protected String username;
	protected String password;
	private double balance;

	

	public Customer() {
		super();
		Roster.customerList.add(this);
		FileStuff.writeCustomerFile(Roster.customerList);
	}


	@SuppressWarnings("static-access")
	public Customer( String firstName, String lastName, String address, String username, String password, double balance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.username = username;
		this.password = password;
		this.balance = balance;
		Roster.customerList.add(this);
		FileStuff.writeCustomerFile(Roster.customerList);
		LogThis.LogIt("info", this.firstName + ", account created successfully.");
	}



	///// bank menu tests
	public int deposit(double amount) {
		balance = balance+amount;
		return (int) balance;
	}
	
	public int withdraw(double amount) {
		balance = balance-amount;
		return (int) balance;
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

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", username="
				+ username + ", password=" + password + ", balance=" + balance + "]";
	}
	

}
	
	