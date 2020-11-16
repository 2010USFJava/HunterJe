package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.dao.EmployeeDao;
import com.revature.project0.Employee;
import com.revature.util.ConnFactory;

public class EmployeeDaoImpl implements EmployeeDao{
	public static ConnFactory cf= ConnFactory.getInstance();
	
	@Override
	public void regNewEmployee(Employee e) throws SQLException {
		Connection conn= cf.getConnection();
		String sql= "insert into employee values(?,?,?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setInt(1, e.getEid());
		ps.setString(2, e.getUsername());
		ps.setString(3, e.getPassword());
		ps.executeUpdate();
	}

	@Override
	public Employee retrieveById(int id) throws SQLException {
		Connection conn= cf.getConnection();
		String sql=  "select * from employee where eid=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		Employee e= null;
		while(rs.next()) {
			e= new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
		}
		return e;
	}

}
