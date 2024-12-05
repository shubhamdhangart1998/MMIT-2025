package com.tnsif.daysix.staticblockmethod;

public class MyClass {

	private int section; //non-static or instances varible 
	
	private static int srNo;  // static or class varible 
	
	
	//static block
	static {
		System.out.println("---Within static block ------------");
		srNo=1000;
		//section=102;
	}


	//default constructor 

	 MyClass() {
	
		 System.out.println("-----Within Default constructor ---------");
		srNo++;    //1001
		section++;   //1
	}


	 //to string 
	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method 
	static void display()
	{
		System.out.println("Serail No :"+ srNo);
	//	System.out.println("Seaction :"+section);
	}
	 
	 
	
	
	
	
}
