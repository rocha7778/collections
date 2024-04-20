package Threads.callable.v1;

import java.util.List;

public class MainMultipleShopsUsingParallelStream {

    public static void main(String[] args) {
        
        Shop shop = new Shop("Rocha");

        long start = System.nanoTime();

        List<String> listOfname = shop.findPricesParallelStream("Adidas");
        long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
		System.out.println("Invocation returned after " + retrievalTime + " msecs");


        listOfname.stream().forEach(System.out::println);

        
    }
    
}
