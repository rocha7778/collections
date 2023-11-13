package anagram;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class HashMapPerformance {
	public static int ITERATION_COUNT = 10_000_000;

	private static AtomicInteger exitThreadCount = new AtomicInteger(0);

	public static ConcurrentHashMap<Integer, Integer> myHashMap;

	public static void initData() {

		myHashMap = new ConcurrentHashMap<>(1000);

		for (int counter = 0; counter < 1000; ++counter) {

			myHashMap.put(counter, counter);
		}
	}

	private static class Writer extends Thread {

		public void run() {

			Random random = new Random();

			for (int iteration = 0; iteration < ITERATION_COUNT; ++iteration) {

				int counter = random.nextInt(1000 - 1);
				myHashMap.put(counter, counter);
			}

			var count = exitThreadCount.incrementAndGet();
			//System.out.println("Contador aumentado por " + Thread.currentThread().getName());
			//System.out.println("Contador  " + count);
		}
	}

	private static class Reader extends Thread {

		public void run() {

			Random random = new Random();

			for (int iteration = 0; iteration < ITERATION_COUNT; ++iteration) {

				int counter = random.nextInt(1000 - 1);
				myHashMap.get(counter);
			}

			var count = exitThreadCount.incrementAndGet();
			//System.out.println("Contador aumentado por " + Thread.currentThread().getName());
			//System.out.println("Contador  " + count);
		}
	}

	public static void main(String args[]) throws Exception {

		initData();

		long start = System.currentTimeMillis();

		// Create 10 Writer Threads
		for (int counter = 0; counter < 10; ++counter) {

			new Writer().start();
		}

		// Create 10 Reader Threads
		for (int counter = 0; counter < 10; ++counter) {

			new Reader().start();
		}

		// Wait for all threads to complete
		while (exitThreadCount.get() < 20) {
			
			Thread.sleep(100);
		}

		System.out.println("Total execution Time(ms): " + (System.currentTimeMillis() - start));
	}
}