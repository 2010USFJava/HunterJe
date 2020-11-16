package com.revature.dao;

import java.sql.SQLException;

import com.revature.project0.Customer;

public interface CustomerDao {
	public void regNewCustomer(Customer c) throws SQLException;
	
	public Customer retrieveById(int id) throws SQLException;
}
