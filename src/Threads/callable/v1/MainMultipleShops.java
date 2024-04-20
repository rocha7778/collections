package Threads.callable.v1;

import java.util.List;

public class MainMultipleShops {

    public static void main(String[] args) {
        
        Shop shop = new Shop("Rocha");

        long start = System.nanoTime();

        List<String> listOfname = shop.findPrices("Adidas");
        long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
		System.out.println("Invocation returned after " + retrievalTime + " msecs");
		
		String hola = "hola";
		
		System.out.print("charAt(0)"+hola.charAt(0));


        listOfname.stream().forEach(System.out::println);

        
    }
    
}
