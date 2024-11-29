package com.tnsif.dayfour.firstpackage;

public class Person {

	
	private String personName;
	private int personAge;
	private String personCity;
	
	// getter and setter 
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	
	
	
	//default constructor 
	public Person() {
		System.out.println("default constructor ");
	}
	
	
	
	// para constructor 
	public Person(String personName, int personAge, String personCity) {
		System.out.println("Para Constructor ");
		this.personName = personName;
		this.personAge = personAge;
		this.personCity = personCity;
	}
	//tostring 
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", personCity=" + personCity + "]";
	}
	
	
	
	
	
	
	
	
	
}
