package com.revature.driver;

import java.sql.SQLException;

import com.revature.dao.CustomerDao;
import com.revature.daoimpl.CustomerDaoImpl;
import com.revature.menu.MainMenu;
import com.revature.project0.Customer;
import com.revature.util.FileStuff;


public class Driver {
	static {FileStuff.readCustomerFile();}
	public static void main(String[] args) {
		MainMenu.mainMenu();
		
		
	}
}
