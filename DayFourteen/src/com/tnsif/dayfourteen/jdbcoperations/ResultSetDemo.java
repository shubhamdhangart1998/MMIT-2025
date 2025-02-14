package com.tnsif.dayfourteen.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {

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
			
			ResultSet rs= stmt.executeQuery("select * from student where stdid=101");
			System.out.println("stdid\t name \t subject\t duration ");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
			}
			
			
			//boolean s=stmt.execute(q);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
