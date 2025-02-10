package com.tnsif.dayeleven.nested;

public class NestedTrycatch {

	
	public static void check()
	{
		String str="TNS";  // lenght 3 index is 2
		int slength=str.length();
		
		System.out.println("String lenght " + slength);
		
		String anotherString =null;
		
		int y=6;
		
		//outer try block 
		try {
			//inner try block 
			try {
				System.out.println(str.charAt(y));  // exception 
			}
			catch (StringIndexOutOfBoundsException e)
			{
				System.err.println(e.getMessage());
			}
			
			System.out.println("String  lenght : "+ anotherString.length());
		}
		
		//outer catch block 
		catch (NullPointerException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
