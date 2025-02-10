package com.tnsif.dayeleven.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;


//multiple catch block for one try block 
public class Division {

	
	public static void divide()
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter two numbers:  ");
		
		
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			
			
			c=a/b;
			
			System.out.println("Division is : "+ c);
		}
		catch (ArithmeticException e)
		{
			System.err.println("Exception caught "+ e.getMessage());
		}
		catch (InputMismatchException  | ArrayIndexOutOfBoundsException e )
		{
			System.err.println("Exception caught "+ e.getMessage());
		}
		catch(Exception e)
		{
			System.err.println("exception caught"+ e.getMessage());
		}
		
		finally {
			sc.close();
			System.out.println("Finally Block -------------");
		}
		System.out.println("Statement after finally block ");
		
	}
}
