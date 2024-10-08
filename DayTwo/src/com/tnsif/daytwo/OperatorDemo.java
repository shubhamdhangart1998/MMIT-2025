package com.tnsif.daytwo;

public class OperatorDemo {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		int x=10;
		
		System.out.println("a and b value before the operation: "+ a + " "+ b);
		
		++a;
//		System.out.println(a);
		
		//a=11
		//   12     20   12
		int c= ++a + b + a--;
		System.out.println("C value after the operators: "+ c);

	//         44    11   20	
		int d= c++  + a + b--;
		System.out.println("D value after the operations : "+ d);
		
		
		
		
		
		
		
	}

}
