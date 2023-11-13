package collection.framework.thread.list;

import java.util.ArrayList;

public class MultithreadedArrayListAccess {
	private static final int NUM_THREADS = 10;
	private static ArrayList<Integer> arrayList = new ArrayList<>();

	public static void main(String[] args) {
		// Populate the ArrayList with some initial values
		for (int i = 0; i < 1000; i++) {
			arrayList.add(i);
		}

		// Create an array to hold the threads
		Thread[] threads = new Thread[NUM_THREADS];

		// Create and start the threads
		for (int i = 0; i < NUM_THREADS; i++) {
			threads[i] = new AccessThread();
			threads[i].start();
		}

		// Wait for all threads to finish
		try {
			for (Thread thread : threads) {
				thread.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Print the modified ArrayList
		System.out.println(arrayList);
	}

	static class AccessThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				// Access and modify the ArrayList without synchronization
				int value = arrayList.get(i);
				arrayList.set(i, value + 1);
			}
		}
	}
}
