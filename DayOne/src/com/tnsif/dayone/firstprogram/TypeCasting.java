package com.tnsif.dayone.firstprogram;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening //implicity type casting 
		
		
		byte b=10;
		int i=b;
		 System.out.println(i);
		 
		 float f=22.13f;
		 double d=f;
		 System.out.println(d);
		 
		 char ch='A';
		 int i3=ch;
		 System.out.println(i3);
		 
		 //narrowing //explicit type casting //chances of data loses
		 
		 double f1=10.5444444444442d;
		 
		 float f23=(float)f1;
		 
		 System.out.println(f23);
		 long l=(long)f1;
		 
		 System.out.println(l);
		 
		 byte b1=90;
		 char ch1=(char) b1;
		 
		 System.out.println(ch1);
		
		
		
	}

}


















