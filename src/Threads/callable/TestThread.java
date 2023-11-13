package Threads.callable;

public class TestThread {
	
	public static void  main(String arg[]) {
		
		
		SumExtendThread test = new SumExtendThread();
		
		test.start();
		
		System.out.println("Main thread" + Thread.currentThread().getName());
		
		
	}

}
