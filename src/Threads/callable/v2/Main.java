package Threads.callable.v2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		Threads.callable.v2.MyShopV3 myShop = new MyShopV3("Rocha");
		Consumer<Object> println = System.out::println;
		
		long start = System.nanoTime();
		CompletableFuture[] futures = myShop.finderPricesStream("Iphone 16").map(f -> f.thenAccept(println))
		.toArray(size -> new CompletableFuture[size]);
		
		CompletableFuture.allOf(futures).join();
		//myShop.finderPricesParallelStream("Iphone 16").stream().forEach(println);
		
		
		 long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
		 System.out.println("Invocation returned after " + retrievalTime + " msecs");
		
		
		
	

	}

}
