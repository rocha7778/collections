package Threads.callable;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {

		int total = 0;

		for (int i = 0; i < 5; i++) {
			total += i;
		}

		System.out.println("Current thread name "+Thread.currentThread().getName());
		throw new MuchMoneyException("Much Money Exception");
		
	}

}
