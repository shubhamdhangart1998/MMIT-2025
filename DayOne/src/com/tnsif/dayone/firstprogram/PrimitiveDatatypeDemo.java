package com.tnsif.dayone.firstprogram;

public class PrimitiveDatatypeDemo {

	public static void main(String[] args) {
		
		//Range of the primitive datatypes 
		//byte takes 1 byte
		// 1 byte = 8 bits    2^8  = 256
		
		byte byteMax= 127;
		byte byteMin= -128;
		
		System.out.println("Max range of byte is "+ byteMax);
		System.out.println("Min range of byte is "+ byteMin);
		
		//short takes 2 byte 
		// 2^16
		
		short shortMax= 32767;
		short shortMin= -32768;
		
		System.out.println("Max range of short is "+ shortMax);
		System.out.println("Min range of short is "+ shortMin);
		
		//int takes 4 byte
		
		int intMax=2147483647;
		
		int intMin=	-2147483648;	
		
		System.out.println("Max range of int is "+ intMax);
		System.out.println("Min range of int is "+ intMin);
		
		//long takes 8 bytes 
		
		long longMax=9223372036854775807L;
		long longMin=-9223372036854775808L;
		
		System.out.println("Max range of long is "+ longMax);
		System.out.println("Min range of long is "+ longMin);
		
		

	}

}
