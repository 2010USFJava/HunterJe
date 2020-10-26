package com.revature.project0;

public class Employee extends User{
	private int employeeId;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String middleName, String lastName) {
		super(firstName,middleName,lastName);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
	
	
	
	
}
