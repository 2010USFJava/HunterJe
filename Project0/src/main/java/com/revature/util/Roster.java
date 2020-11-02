package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.menu.MainMenu;
import com.revature.project0.Customer;

public class Roster {
	public static List<Customer> customerList= new ArrayList<Customer>();
	
	public static Customer findCustomerByName(String inputName) {
		for (int i = 0; i < customerList.size(); i++) {
			String name = customerList.get(i).getFirstName();
			if(inputName.equals(name)) {
				return customerList.get(i);
			}
		}
		System.out.println("Login Not Found");
		MainMenu.mainMenu();
		return null;
	}
	
	
}
