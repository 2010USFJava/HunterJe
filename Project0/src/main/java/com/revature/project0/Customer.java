package com.revature.project0;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

import com.revature.util.FileStuff;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6203030530990934950L;
	//basic info
	private String Username;
	private String Password;
	private String firstName;
	private String lastName;
	Random acctNum = new Random();
	

	public Customer() {
		super();
		Roster.customerList.add(this);
		FileStuff.writeCustomerFile(Roster.customerList);
	}

	public Customer(String username, String password, String firstName, String lastName, Random acctNum) {
		super();
		Username = username;
		Password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.acctNum = acctNum;
		Roster.customerList.add(this);
		FileStuff.writeCustomerFile(Roster.customerList);
		LogThis.LogIt("info", this.getFirstName() + " logged in successfully!");
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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

	public Random getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(Random acctNum) {
		this.acctNum = acctNum;
	}

	@Override
	public String toString() {
		return "Customer [Username=" + Username + ", Password=" + Password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", acctNum=" + acctNum + "]";
	}

}