package com.revature.services;

import java.util.Scanner;

public class CurrentAccount extends BankMenu {
	static Scanner scan = new Scanner(System.in);
	
	private double minBalance;
	
	public CurrentAccount(double minBalance,String custName, int acctNumber, double initialBalance) {
		super();
		this.minBalance= minBalance;
	}
	
	
}
