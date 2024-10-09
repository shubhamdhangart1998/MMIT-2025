package com.tnsif.daytwo;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		
		//program to print the multiplication tables in agiven range by using mested 
		
		//for loop
		
		int beg=2;
		
		int end=4;
		
		for(int i=beg; i<=end; i++)
		{
			for (int j=1; j<=10; j++)
			{
				System.out.println(i + "*" + j+ "= "+ i*j);
			}
			System.out.println();
		}

	}

}
