package com.tnsif.daytwelve.synchronization;

public class DepositLimitException extends Exception {

	public DepositLimitException()
	{
		super("Daily limit of deposit is exceeded....");
	}
	
	public DepositLimitException(String message)
	{
		super (message);
	}
}
