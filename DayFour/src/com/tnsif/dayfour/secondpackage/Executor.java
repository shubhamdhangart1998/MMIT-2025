package com.tnsif.dayfour.secondpackage;

import com.tnsif.dayfour.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		//accessing different package class
		
		Base b1=new Base();
		
		//private , default, and protected can't access
		
		b1.methodpublic();
//		b1.methodprotected();
//		b1.methoddefault();
//		b1.methodprivate();
		
		b1.varPublic=100;
		b1.methodpublic();
		

	}

}
