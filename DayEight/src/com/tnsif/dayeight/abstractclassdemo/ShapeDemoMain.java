package com.tnsif.dayeight.abstractclassdemo;

public class ShapeDemoMain {

	public static void main(String[] args) {
	
		
		//Shape s=new Shape();   we cannot create object of abstract class
		
		Square s=new Square(5.0f);
		s.calArea();
		s.show();
		
		Rectangular r=new Rectangular(10.09f, 2.3f);
		r.calArea();
		r.show();
		
		
		//dyanamic bindling //runtime poly // late binding 
		Shape s1;
		
		s1=new Square();
		s1.calArea();
		s1.show();
		
		s1=new Rectangular();
		s1.calArea();
		s1.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
