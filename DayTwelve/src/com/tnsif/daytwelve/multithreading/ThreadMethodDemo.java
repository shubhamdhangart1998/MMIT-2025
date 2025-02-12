package com.tnsif.daytwelve.multithreading;

public class ThreadMethodDemo {

	public static void main(String[] args) {
	
		
		
		ChildThread t1=new ChildThread(5, "First");
		ChildThread t2=new ChildThread(10, "second");
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("Parent Thread");  // assign name to main thread as a parent 
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Curret Thread : "+ Thread.currentThread());
		
		try {
			t1.join();  // wait current thread until t1 is dead 
			t2.join();
		}
		catch (InterruptedException e)
		{
			System.err.println(e.getMessage());
		}

		System.out.println("-------End of main--------");
	}

}
