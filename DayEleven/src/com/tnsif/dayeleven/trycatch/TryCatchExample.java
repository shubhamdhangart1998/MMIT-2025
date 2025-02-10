package com.tnsif.dayeleven.trycatch;

public class TryCatchExample {

	
	static void performDivision(int x, int y)
	{
		System.out.println("I am in method ");
		
		int z;
		try {
			System.out.println("I am in try block ");
			
			z=x/y;
			System.out.println(z);
		}
		catch (ArithmeticException mmit) {
			
			System.err.println(" I am in catch block "+ mmit.getMessage());
		}
		
	}
	
}
