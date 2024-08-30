package Threads.callable.v4;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class ShopTest {
	
	private Random random = new Random();
	private String name;
	
	
	
	public ShopTest(String name) {
		super();
		this.name = name;
	}

	public double getPrice(String productName) {
		return calculePrice(productName);
	}
	
	public Future<Double> getPriceAsync(String productName){
		
		CompletableFuture<Double> futurePrice = new CompletableFuture<>();
		
		new Thread(() ->{
			
			double price = calculePrice(productName);
			futurePrice.complete(price);
		}).start();
		
		return futurePrice;
	
		
	}
	
	private double calculePrice(String productName) {
		delay();
		return random.nextDouble() * productName.charAt(0) + productName.charAt(1);
	}
	
	private void delay() {
		
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
