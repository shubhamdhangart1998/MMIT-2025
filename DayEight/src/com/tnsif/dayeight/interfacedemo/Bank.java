package com.tnsif.dayeight.interfacedemo;

public interface Bank {

	final static float MINBAL = 5000;  // default it is consider as final and static varible 
	final static float Deposit_Limit=25000;
	
	public void deposit (float amount);
	public void withdraw(float amount );
	
	
	
}
