package com.tnsif.dayfourteen.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		try {
			
			//step 1 : load or register the driver 
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded successfully");
			
			//step2: create connection 
			
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mmitpvg","root","root");
			
			System.out.println("Connecetion created successfully ");
			
			//step 3 : create statement 
			
			Statement stmt=con.createStatement();
			System.out.println("Statement create successfully ");
			
			//prepare stmt obj which consist of ? place holder 
			
			PreparedStatement psmt=con.prepareStatement("insert into student values(?,?,?,?)");
			
			psmt.setInt(1, 103);
			psmt.setString(2, "Aniket");
			psmt.setString(3, "JS");
			psmt.setDouble(4, 45.67);
			psmt.addBatch();
			
			psmt.setInt(1, 104);
			psmt.setString(2, "SHreyash");
			psmt.setString(3, "Python");
			psmt.setDouble(4, 23.67);
			psmt.addBatch();
			
			
			int [] a=stmt.executeBatch();
			a=psmt.executeBatch();
			System.out.println(a.length);
			
			
			
			
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
