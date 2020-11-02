package com.revature.project0;

import java.util.Random;

public class accountMenu {
//	public accountMenu() {
//		super();
//		System.out.println("View Account\n");
//	}
	enum AccountType{
		checking,
		savings,
		joint,
	}
	
	
	private static int accountNum;
	private double balance;
	private double deposit;
	private double withdraw;
	
	public accountMenu() {
        balance = 300; 
    }
	
	public accountMenu(double balance) {
        this.balance = balance;
    }
	
	public static void createAccountNum() {
		Random random = new Random();
		accountNum=random.nextInt(30000);
	}
	public static int getAccountNum() {
		return accountNum;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	@Override
	public String toString() {
		return "accountMenu [balance=" + balance + "]";
	}
	
	
	
	
}



