package Threads.callable.v1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MainShop {

	public static void main(String[] args) {

		Shop shop = new Shop("Nike");
		long start = System.nanoTime();
		Future<Double> futurePrice = shop.getPriceAsync("Nike");
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
		
		int numberOfProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of CPUs: " + numberOfProcessors);
        
        System.out.println("Min number 0 -100: " + Math.min(ShopsList.shops.size(), 100));
        
        System.out.println("Number of shops" + ShopsList.shops.size());

	}

}
