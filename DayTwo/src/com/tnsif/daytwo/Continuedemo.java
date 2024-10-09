package com.tnsif.daytwo;

public class Continuedemo {

	public static void main(String[] args) {
		
		for(int k=5;k<15;k++)
		{
			//odd numbers are skipped
			if(k%2!=0)
				continue;
			//Even number are printed
			System.out.println(k+ " ");
		}

	}

}
