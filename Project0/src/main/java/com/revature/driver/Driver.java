package com.revature.driver;

import com.revature.menu.MainMenu;
import com.revature.project0.Customer;
import com.revature.util.FileStuff;
import com.revature.util.Roster;


public class Driver {
	static {FileStuff.readCustomerFile();}
	public static void main(String[] args) {
		MainMenu.mainMenu();
	}
}
