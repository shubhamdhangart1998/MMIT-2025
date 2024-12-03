package com.tnsif.dayfive.hierarchicalinheritance;

public class Student extends Person {

	
	private String std;
	private float percent;
	
	//defult
	public Student() {
		System.out.println("Student class default constructor ");
		std="FY";
		percent=70.89f;
	}

	public Student(String name, String city,String std, float percent) {
		super( name,  city);
		this.std = std;
		this.percent = percent;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [std=" + std + ", percent=" + percent + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ "]";
	}
	
	
	
	
	
	
	
}
