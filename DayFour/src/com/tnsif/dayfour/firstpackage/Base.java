package com.tnsif.dayfour.firstpackage;

public class Base {

	//declare default,private, protected and public varialbes
	
	int vardefault = 10;
	public int varPublic = 20;
	private int varPrivate= 30;
	protected int varProtected = 40;
	
	//declare default, private, protected and public
	
	void methoddefault()
	{
		System.out.println("Default access base class");
		System.out.println(" Default variable :"+ vardefault);
	}
	private void methodprivate()
	{
		System.out.println("Private access base class");
		System.out.println(" Private variable :"+ varPrivate);
	}
	
	public void methodpublic()
	{
		System.out.println("Public access base class");
		System.out.println(" Public variable :"+ varPublic);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected access base class");
		System.out.println("Protected variable :"+ varProtected);
	}
}
