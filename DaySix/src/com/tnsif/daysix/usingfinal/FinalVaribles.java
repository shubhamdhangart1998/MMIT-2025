package com.tnsif.daysix.usingfinal;

public class FinalVaribles {

	

	//final int x; // final instance varible must be initialized
	
	final int x=100;
	
	//declare static blank final variable
	
	final static int y;
	
	//declare and initialized static final varble 
	
	final static int z=10;
	
	
	//instances method 
	void change ()
	{
		//x=30;  final varible can't be reassigned
		//y=200; final static varibles can't be reassigned / assigned values in non static method 
	}


	@Override
	public String toString() {
		return "FinalVaribles [x=" + x + ", y=" + y+"]";
	}
	
	
	//decalree a static block to intialize the final static varible ----------- y
	static
	{
		y=20;
	
		//z=100;  once initialized can't be reassigned
		System.out.println("Value of Y : "+y);
	}
	
	
	
	
	
	
	
	
	
	
}
