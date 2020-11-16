package com.revature.dao;

import java.sql.SQLException;

import com.revature.project0.Employee;

public interface EmployeeDao {
	public void regNewEmployee(Employee e) throws SQLException;
	
	public Employee retrieveById(int id) throws SQLException;
}
