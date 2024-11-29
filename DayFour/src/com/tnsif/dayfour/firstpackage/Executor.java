package com.tnsif.dayfour.firstpackage;

public class Executor {

	public static void main(String[] args) {
	
		//accessing same package class
		Base b1=new Base();
		b1.methoddefault();
		b1.methodProtected();
		b1.methodpublic();
	  //b1.methodprivate();
		
		b1.vardefault=11;
		b1.methoddefault();
		
		//b1.varPrivate=32;
		
		b1.varProtected=21;
		b1.methodProtected();
		
		b1.varPublic=41;
		b1.methodpublic();
		
		
		//instance of operator
		System.out.println(b1 instanceof Base ); //reture true / or else it will give the compile time time error 
		
		
	}

}
