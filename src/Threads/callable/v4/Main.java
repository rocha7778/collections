package Threads.callable.v4;

import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShopTest shop = new ShopTest("Nike");
		System.out.printf("The price of Nike Shoes are %.2f%n" , shop.getPrice("Nike"));
		
		
		long start = System.nanoTime();
		Future<Double> futurePrice = shop.getPriceAsync("Nike");
		long invocationTime = ((System.nanoTime() - start) / 1_000_000);
		System.out.println("Invocation return after " + invocationTime + " msecs");
		
		try {
			
			double price = futurePrice.get();
			System.out.printf("Price is %.2f%n", price);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
		System.out.println("Price return after " + retrievalTime + " msecs");

	}

}
