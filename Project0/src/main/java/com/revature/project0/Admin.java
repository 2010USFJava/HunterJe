package com.revature.project0;

public class Admin extends Employee{
	private int adminId; {
	}
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminId) {
		super();
		this.adminId = adminId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + "]";
	}
	
	
	
	
	
}
