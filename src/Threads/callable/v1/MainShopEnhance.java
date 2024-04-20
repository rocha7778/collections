package Threads.callable.v1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MainShopEnhance {

	public static void main(String[] args) {

		Shop shop = new Shop("Nike");
		long start = System.nanoTime();
		Future<Double> futurePrice = shop.getPriceAsyncEnhance("Nike");
		long invocationTime = ((System.nanoTime() - start) / 1_000_000);
		System.out.println("Invocation returned after " + invocationTime + " msecs");

		int j = 10_000_000;
		while (j > 0) {
			j--;
		}

		System.out.println("Do something more else");

		try {
			Double price = futurePrice.get();
			System.out.printf("The price is %.2f\n", price);

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
		System.out.println("Invocation returned after " + retrievalTime + " msecs");

	}

}
