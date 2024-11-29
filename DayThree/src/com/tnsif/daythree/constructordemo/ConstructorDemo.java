package com.tnsif.daythree.constructordemo;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String name, city;
		int id;
		System.out.println("Enter Customer id :");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name");
		name=sc.nextLine();
		
		System.out.println("enter Customer City");
		city=sc.nextLine();
		
		System.out.println("  ");
		
		Customer c1 = new Customer(); //default constructor 
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		c1.setCustomerCity(city);
	
		System.out.println(c1);
		
		System.out.println("Enter Customer id :");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name");
		name=sc.nextLine();
		
		System.out.println("enter Customer City");
		city=sc.nextLine();
		
		System.out.println("  ");
		
		Customer c2=new Customer(name, id, city);
		System.out.println(c2);
		
		
		
		
		
		
		
		

	}

}
