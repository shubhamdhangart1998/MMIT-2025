package com.tnsif.dayseven.overloading;

public class OverLoadingDemo {

	public static void main(String[] args) {
		
		
		System.out.println("----------Constructor Overloading -----------");
		
		Point p=new Point();
		System.out.println(p);
		
		p=new Point(14.5f);
		System.out.println(p);
		
		p=new Point(3.33f, 66.66f);
		System.out.println(p);
		
		
		System.out.println("-------Method overloading -------------");
		
		System.out.println("Addition of two integers "+ MethodOverLoading.addition(50, 100));
		System.out.println("Addition of two floats "+ MethodOverLoading.addition(23.34f, 34.56f));
		System.out.println("Addition of three integers "+ MethodOverLoading.addition(10, 20, 30));
		System.out.println("Addition of two integers & float  "+ MethodOverLoading.addition(33.33f, 66));
		MethodOverLoading.addition("Shubham", 1234);
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
