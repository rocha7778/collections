package Threads.callable;

public class SumExtendThread  extends Thread{
	
	
	public void run() {
        // compute primes larger than minPrime
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        System.out.println("Another thread name "+ Thread.currentThread().getName());
    }

}
