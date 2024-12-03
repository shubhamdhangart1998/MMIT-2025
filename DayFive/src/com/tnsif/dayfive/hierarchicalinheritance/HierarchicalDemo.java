package com.tnsif.dayfive.hierarchicalinheritance;

public class HierarchicalDemo {

	public static void main(String[] args) {
		
		
		Person p1=new Person();
		System.out.println("-----Person details---------");

		System.out.println(p1);
		
		
		Person p;
		p=new Person("Heti", "Mumbai");
		System.out.println("Person Details :"+ p);
		
		p=new Employee("Vaishanavi", "nagar", 1001, 56000.0f, "DA");
		System.out.println("Employee Details :"+ p);
		
		
		p=new Student("Shubham", "Nashik", "TY", 56.67f);
		System.out.println("Student Details :"+ p);
		
		
		
	}

}
