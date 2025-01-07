package com.tnsif.dayeight.abstractclassdemo;

public abstract class Shape {

	protected float area;
	
	//abstarct method 
	
	public abstract void calArea();
	
	
	//solid method 
	public void show()
	{
		System.out.println("Area of the shape is "+ area);
	}
	
}
