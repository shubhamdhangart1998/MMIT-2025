package com.tnsif.dayeight.abstractclassdemo;

public class Rectangular extends Shape {

	
	float width;
	float height;
	
	//default constructor 
	public Rectangular()
	{
		width=3.0f;
		height=2.0f;
	}
	
	//para constructor 
	public Rectangular(float width, float height) {
		
		this.width = width;
		this.height = height;
	}



	@Override
	public void calArea() {
		this.area=width*height;
		
	}

}
