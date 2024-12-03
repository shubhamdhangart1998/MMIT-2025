package com.tnsif.dayfive.singleinheritance;


//child class
public class Student extends Citizen{

	
	//data members
	private int rollNo;
	private String collegename;
	
	//non para
	public Student() {
		super();
	}

	//para constructor 
	public Student(String name, String city, String adharNo, String address, long phone,int rollNo, String collegename) {
		super( name,  city,  adharNo,  address,  phone);
		this.rollNo = rollNo;
		this.collegename = collegename;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegename=" + collegename + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress()
				+ ", getPhone()=" + getPhone() + "]";
	}
	
	
	
	
	
}
