package com.tnsif.daythree.encapsulationDemo;

public class EncapsulationDemoDriver {

	public static void main(String[] args) {

		//object creation 
		OopsConceptDemo obj=new OopsConceptDemo();
		
		obj.setSerialNum(12345);
		obj.setName("Aakash");
		obj.setAge(26);
		
		System.out.println(obj);
		
		System.out.println();
		System.out.println(obj.getSerialNum());
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
