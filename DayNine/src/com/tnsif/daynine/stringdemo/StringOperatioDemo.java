package com.tnsif.daynine.stringdemo;

public class StringOperatioDemo {

	public static void main(String[] args) {
	
	String s1=new String(" Indian ");  //8, length-1=7
	
	System.out.println(s1);
	String s2=s1.toUpperCase();
	System.out.println(s2);
	System.out.println(s1.length());  // length:1    index:0
	int a=s2.length();
	System.out.println("Lenght is : "+a);
	String s3=s1.substring(1,7);
	System.out.println(s3);
	System.out.println(s1.trim());
	System.out.println(s1.stripTrailing());
	System.out.println(s1.isEmpty());
	
	//string comparison 
	
	s2=new String (s1);
	
	//== referal comparison // check memeory compare
	//equals compare the data 
	
	System.out.println("Case 1: "+ s1.equals(s2));//true
	System.out.println("case 2 :"+ (s1==s2)); //false
	
	
			
	
	
	
	

	}

}
