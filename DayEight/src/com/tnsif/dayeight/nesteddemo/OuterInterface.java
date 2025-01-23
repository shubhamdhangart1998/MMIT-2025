package com.tnsif.dayeight.nesteddemo;

public interface OuterInterface {

	
	void calArea();
	
	interface InnerInterface
	{
		int id=20;
		void print();
	}
}
