package com.tnsif.daythree.scannerdemo;

import java.util.Scanner;

public class PersonDemoDriver {

	public static void main(String[] args) {
	
		Scanner ob=new Scanner(System.in);
		
		
		String name;
		System.out.println("Enter Person name :");
		name=ob.next();
		System.out.println("Enter age : ");
		int age = ob.nextInt();
		System.out.println("Enter gender : ");
		String gender = ob.next();
		System.out.println("Enter Income :");
		int income=ob.nextInt();
		
		Person person=new Person();
		person.setName(name);
		person.setGender(gender);
		person.setAge(age);
		person.setIncome(income);
		
		System.out.println(person);
		
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person);
		
		System.out.println("After calculation tax :");
		
		System.out.println(person);
		
		
		
		
		
	}

}
