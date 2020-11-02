package com.revature.driver;

import com.revature.menu.MainMenu;
import com.revature.project0.Customer;
import com.revature.util.FileStuff;
import com.revature.util.Roster;


public class Driver {
	static {FileStuff.readCustomerFile();}
	public static void main(String[] args) {
		//Customer jennifer= new Customer("jhunter77","zeus","Jennifer","","Hunter");
		//Customer makiah= new Customer("mcool16","faith","Makiah","","James");
		//System.out.println(Roster.customerList.toString());
		MainMenu.mainMenu();
	}
}
