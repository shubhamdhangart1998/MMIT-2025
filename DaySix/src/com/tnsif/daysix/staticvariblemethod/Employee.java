package com.tnsif.daysix.staticvariblemethod;

public class Employee {

	private String name;
	private int id;
	
	//Declare a static varible companyName with data type string assign the value 
	
	static String companyName ="TNS";

	
	//declare a two parameter constructor 

	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company="+companyName+"]";
	}
	
	
	
	
	
	
}
