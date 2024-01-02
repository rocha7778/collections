package thread.test;

public class LoopTestMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int numThreads = 5;

		Thread[] threads = new Thread[numThreads];

		for (int i = 0; i < numThreads; i++) {
			threads[i] = new LoopTest();
			threads[i].start();
		}

		for (Thread thread : threads) {
			thread.join();
		}

		System.out.println("Result " + LoopTest.x);
		
		
		Float f1 = new Float ("3.0");
		int x = f1.intValue ();
		byte b = f1.byteValue();
		double d = f1.doubleValue ();
		
		System.out.println("int number: "+ x);
		System.out.println("Byte number: "+ b);
		System.out.println("Double number: "+ d);
		System.out.println (x + b + d);
		

	}

}
