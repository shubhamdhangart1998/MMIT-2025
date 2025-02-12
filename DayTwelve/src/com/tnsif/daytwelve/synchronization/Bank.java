package com.tnsif.daytwelve.synchronization;

public interface Bank {

	
	static final int MINBAL =5000;
	static final int DAILY_LIMIT=25000;
	void deposit (int amt) throws DepositLimitException;
	void withdraw(int amt) throws InsufficientBalanceException;
}
