package com.tnsif.dayeleven.trycatch;

public class CheckedException {

	public static void main(String[] args) {
		
		int x[];
		try {
			x=new int[] {1,2,3,4,5}; //index no 4 i have data
			
			System.out.println(x[4]);  // out of bound 
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Specified index does  not exist "+ e.getMessage());
		}

	}

}
