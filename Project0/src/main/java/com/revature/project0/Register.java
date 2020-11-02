package com.revature.project0;

public class Register extends Customer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2893165186097382813L;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	public Register() {
		super();
		System.out.println("Register\n");
	}

	public Register(String username, String password, String firstName, String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return "Register [username=" + username + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}
	
}