package com.tnsif.daythree.constructordemo;

public class Customer {

	
	//data members
	private String customerName;
	private int customerId;
	private String customerCity;
	
	
//	//default constructor 
	public Customer() {
		System.out.println("Default Constructor ");
	}

	
	//parameteriozed Constructor 
	//use this keyword
	
	// Customer c=new Customer("Shubham", 1001, "Pune")
	public Customer(String customerName, int customerId, String customerCity) {
	
		this(); //this calling the default constructor 
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}


	//For get the data which is store in the object class 
	//Object class is the most super class/ Parent class of all the classes
	//it stores the address of the memory location 
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	
	
	
	
	
	
}
