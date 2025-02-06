package com.tnsif.daynine.stringdemo;

public class SampleStringDEmo {

	public static void main(String[] args) {
		
		
		//initialise string
		
		char c[]= {'I','n','d','i','a'};
		
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String (s1);
		System.out.println(s2);
		
		//concatent to prevent long lines 
		
		String longstr="This is to show "+ "How long sentences "+ "can be saved ";
		
		
		System.out.println(longstr);
		
		
	}
}
