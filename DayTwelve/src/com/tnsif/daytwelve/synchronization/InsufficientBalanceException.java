package com.tnsif.daytwelve.synchronization;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException()
	{
		super("Insufficeint balance in ur act");
	}
	
	public InsufficientBalanceException(String message)
	{
		super (message);
	}
}
