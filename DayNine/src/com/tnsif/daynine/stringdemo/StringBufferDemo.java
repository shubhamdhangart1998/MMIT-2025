package com.tnsif.daynine.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		//string buffer mutable changes 
		
		StringBuffer buffer =new StringBuffer("Hello");
		System.out.println("Buffer = "+buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity()); //string capaticy = 16
		//appending and inserting into buffer 
		String s;
		int a=42;
		buffer =new  StringBuffer(40);
		s=buffer.append("a= ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer =new StringBuffer("I Java!");
		buffer.insert(2, " Like ");
		System.out.println(buffer);
		
		buffer.delete(3, 6);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
		
		
		

	}

}
