package com.tnsif.dayeight.nesteddemo;

public class NestedDemo implements OuterInterface, OuterInterface.InnerInterface {

	@Override
	public void calArea() {
	System.out.println("outer");
		
	}

	@Override
	public void print() {
		System.out.println("inner");
	}


}
