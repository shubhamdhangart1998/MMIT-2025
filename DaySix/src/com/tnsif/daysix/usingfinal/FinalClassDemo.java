package com.tnsif.daysix.usingfinal;

final class FinalClass
{
	
	
	void show ()
	{
		System.out.println("Final Class cannot be inherited ");
	}
}



public class FinalClassDemo {

	public static void main(String[] args) {
		
		FinalClass f1=new FinalClass();
		f1.show();

	}

}
