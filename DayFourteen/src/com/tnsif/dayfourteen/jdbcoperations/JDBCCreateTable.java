package com.tnsif.dayfourteen.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCCreateTable {

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
			
			//step 4 write a query 
			
			String q="create table student"
					+ "(stdid int, name varchar(20), subject varchar(20), duration double)";
			
			
			boolean s=stmt.execute(q);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
