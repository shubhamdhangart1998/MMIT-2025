package com.tnsif.dayfive.hierarchicalinheritance;

public class Person {

	
	private String name;
	private String city;
	
	//non para constructor 
	public Person() {
		
		
		System.out.println("person class default constructor ");
		name="Aditya";
		city="Pune";
	}

	
	//para constructor 
	public Person(String name, String city) {
	
		this.name = name;
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
	
}
