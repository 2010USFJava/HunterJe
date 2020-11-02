package com.revature.project0;

public class Employee extends Customer{
	private int employeeId;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId) {
		super();
		this.setEmployeeId(employeeId);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + "]";
	}
	
	
	
	
	
	
	
	
}
