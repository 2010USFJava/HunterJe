package com.revature.project0;

import java.util.Scanner;

public class Login extends Customer {
	private String username;
	private String password;
	private boolean access;
	
	public Login() {
		super();
		System.out.println("Login\n");
	}

	public Login(String username, String password, boolean access) {
		super();
		this.username = username;
		this.password = password;
		this.access = access;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", access=" + access + "]";
	}
	
}
