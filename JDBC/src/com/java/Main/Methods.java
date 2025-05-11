package com.java.Main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

class Methods {
	public void readRecords() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/demo";
		String username = "root";
		String password = "1234";
		String query = "SELECT * FROM tab2";
		
		
		Connection con = DriverManager.getConnection(url, username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getFloat(3));
			System.out.println("-----x-----");
		}
		
		con.close();
	}
	
	public void insertQuery(String que) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/demo";
		String username = "root";
		String password = "1234";
//		String query = "INSERT INTO tab2 VALUES (5, 'Hariharan', 8.11), (6, 'Lawliet', 9.9)";
		String query = que;
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int row = st.executeUpdate(query);
		
		System.out.println("No. of Rows affected: " + row);
	}
	
	
	public void insertUsingPst() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/demo";
		String username = "root";
		String password = "1234";
		
		
		int id =  9;
		String name = "Yagami";
		float gpa = 9.1f;
		
		String query = "INSERT INTO tab2 VALUES (?, ?, ?)";
		
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setFloat(3, gpa);
		
		int row = pst.executeUpdate();
		System.out.println("No. of rows affected " + row);
		
		con.close();
	}


	public void upadateUsingPst() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/demo";
		String username = "root";
		String password = "1234";
		
		int id = 5;
		
		String query = "UPDATE Tab2 SET gpa = 10.0 WHERE id = ?";
		
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setInt(1, id);
		int row = pst.executeUpdate();
		System.out.println("No. of rows affected: "+row);
		con.close();
	}
	
	public void sp() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/demo";
		String username = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, username, password);
		CallableStatement cst = con.prepareCall("{CALL getTab2}");				
		ResultSet rs = cst.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getFloat(3));
		}
		
		con.close();
	}
	
	
	public void sp2() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/demo";
		String username = "root";
		String password = "1234";
		
		int id = 5;
		
		Connection con= DriverManager.getConnection(url, username, password);
		CallableStatement cst = con.prepareCall("{CALL getTab2ById(?)}");
		cst.setInt(1, id);
		ResultSet rs = cst.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getFloat(3));
		}
		
		con.close();
		}
	
	
		public void sp3() throws SQLException{
			String url = "jdbc:mysql://localhost:3306/demo";
			String username = "root";
			String password = "1234";
			
			int id = 5;
			
			Connection con = DriverManager.getConnection(url, username, password);
			CallableStatement cst = con.prepareCall("{CALL getNameById(?, ?)}");
			
			cst.setInt(1, id);
			cst.registerOutParameter(2, Types.VARCHAR);
			
			cst.executeUpdate();
			
			System.out.println(cst.getString(2));
			con.close();
		}
		
		
		public void commitdemo() throws SQLException {
			String url = "jdbc:mysql://localhost:3306/demo";
			String username = "root";
			String password = "1234";
			
			String q1 = "UPDATE Tab2 SET gpa = 9.7 WHERE id = 6";
			String q2 = "UPDATE Tab2 SET gpa = 9.1 WHERE id = 7";
			
			Connection con = DriverManager.getConnection(url, username, password);
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			
			int row1 = st.executeUpdate(q1);
			int row2 = st.executeUpdate(q2);
			
			System.out.println("No. of Rows affected " + row1);
			System.out.println("No. of Rows affected " + row2);
			
			if(row1 > 0 && row2 > 0) con.commit();	
		}
}
