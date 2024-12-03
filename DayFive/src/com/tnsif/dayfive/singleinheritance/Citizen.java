package com.tnsif.dayfive.singleinheritance;


//parent class
public class Citizen {

	//data members
	private String name;
	private String City;
	private String adharNo;
	private String address;
	private long phone;
	
	
	
	//non para constructor 
	public Citizen() {
		System.out.println("Citizen object created ");
	}


	//para constructor 

	public Citizen(String name, String city, String adharNo, String address, long phone) {
		
		this.name = name;
		this.City = city;
		this.adharNo = adharNo;
		this.address = address;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getAdharNo() {
		return adharNo;
	}


	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	//toString 
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", City=" + City + ", adharNo=" + adharNo + ", address=" + address + ", phone="
				+ phone + "]";
	}
	
}
