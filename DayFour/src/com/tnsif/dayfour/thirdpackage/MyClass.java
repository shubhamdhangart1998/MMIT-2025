package com.tnsif.dayfour.thirdpackage;

public class MyClass {

	private static MyClass obj=new MyClass();
	
	private int id;

	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private MyClass()
	{
		System.out.println("I M Private Constructor ");
		System.out.println("MyClass object created ");
	}
	
	public static MyClass getObject()
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	
	
}
