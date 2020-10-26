package com.revature.project0;

public class User {
	//basic info
	private String firstName;
	private String middleName="";
	private String lastName;
	
	
	//constructors
	public User() {	
	}
	
	public User(String firstName, String middleName, String lastName) {
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	}
	
	public User(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + "]";
	}
	
	
}
