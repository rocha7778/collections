package Threads.callable.v1;

import java.util.List;

public class MainMultipleShopsUsingCompletableFuture {

    public static void main(String[] args) {
        
        Shop shop = new Shop("Rocha");
        String productName = "Iphone17";

        long start = System.nanoTime();

        List<String> listOfname = shop.findPricesCompletableFuture(productName);
        long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
		System.out.println("Invocation returned after " + retrievalTime + " msecs");


        listOfname.stream().forEach(System.out::println);

        
    }
    
}
