package com.tnsif.dayfour.firstpackage;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		Scanner sc=new Scanner(System.in);
		
		
		String name, city;
		int age;
		
		System.out.println("Enter person details: Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		
		System.out.println(p1);
		
		System.out.println("person details Name : " + p1.getPersonName()
		+ " "+ p1.getPersonCity() + " "+p1.getPersonAge());

		
		System.out.println("Enter person details: Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		
		
		p1=new Person(name, age, city);
		System.out.println("person details Name : " + p1.getPersonName()
		+ " "+ p1.getPersonCity() + " "+p1.getPersonAge());
	}

}
