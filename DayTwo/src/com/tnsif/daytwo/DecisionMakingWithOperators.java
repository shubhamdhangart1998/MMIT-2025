package com.tnsif.daytwo;

public class DecisionMakingWithOperators {

	public static void main(String[] args) {
		
		int x=8, y=7;
		int a=12;
		int b=11;
		
		if(x>= y)
		{
			System.out.println("true ");
		}
		else {
			System.out.println("False");
		}
		//   a>b  ||   a==b
		if(!(a<b) || (a==b))  // atleast one condition should be true  // And all the condition shoul be true  
		{
			System.out.println("Condition is TRUE");
		}
		else {
			System.out.println("condition is false");
		}

	}

}
