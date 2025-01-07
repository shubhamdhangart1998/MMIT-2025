package com.tnsif.dayseven.overriding;

public class OverRidingDemo {

	public static void main(String[] args) {
		
		RBI rbi;
		
		//dynamic binding assigning child class object to parent class reference variables 
		
		rbi=new SBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());

	}

}
