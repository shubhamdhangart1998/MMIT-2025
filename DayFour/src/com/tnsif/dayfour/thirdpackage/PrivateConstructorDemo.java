package com.tnsif.dayfour.thirdpackage;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
	
		//Can't create object with private Constructor 
		//MyClass m1=new MyClass();
		
		MyClass m1=MyClass.getObject();
		m1.setId(10);
		
		MyClass m2=MyClass.getObject();
		m2.setId(20);
		
		System.out.println(m1);
		System.out.println(m2);

	}

}
