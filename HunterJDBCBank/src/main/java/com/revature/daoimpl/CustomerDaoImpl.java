package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.dao.CustomerDao;
import com.revature.project0.Customer;
import com.revature.util.ConnFactory;

public class CustomerDaoImpl implements CustomerDao{
	public static ConnFactory cf= ConnFactory.getInstance();
	
	@Override
	public void regNewCustomer(Customer c) throws SQLException {
		Connection conn= cf.getConnection();
		String sql= "insert into customer values(DEFAULT,?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, c.getFirstName());
		ps.setString(2, c.getLastName());
		ps.setString(3, c.getAddress());
		ps.setString(4, c.getUsername());
		ps.setString(5, c.getPassword());
		ps.setDouble(6, c.getBalance());
		ps.executeUpdate();		
	}

	public void updateBalance(Customer c) throws SQLException{
		Connection conn= cf.getConnection();
		String sql= "update customer ";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setDouble(6, c.getBalance());
		ps.executeUpdate();
	}
	
	@Override
	public Customer retrieveById(int id) throws SQLException {
		Connection conn= cf.getConnection();
		String sql= "select * from customer where cid=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		Customer a= null;
		while(rs.next()) {
			a= new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
					rs.getString(5), rs.getDouble(6));
		}
		return a;
	}

}
