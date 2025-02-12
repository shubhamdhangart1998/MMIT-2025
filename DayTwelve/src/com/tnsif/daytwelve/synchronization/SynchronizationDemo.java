package com.tnsif.daytwelve.synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		
		Account a1=new Account(123456, "Aniket", 50000);
		
		System.out.println(a1);
		
		AccountThread t[]=new AccountThread[10];
		for(int i=0;i<10;i++)
		{
			t[i] = new AccountThread(a1, 8000 * (i+1));
		}
		try {
			for(int i=0; i<10; i++)
			{
				t[i].join();
			}
		
		}
		catch (InterruptedException e)
		{
			System.err.println(e.getMessage());
		}

		System.out.println("--------------------------------");
		System.out.println(a1);
	}

}
