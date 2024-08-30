package Threads.callable.v4;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import Threads.callable.v3.third.part.Discount;
import Threads.callable.v3.third.part.Quote;

public class MyShop2 {

	public static void main(String[] args) {

		long start = System.nanoTime();
		System.out.println(findPricessCompletableFuture("Iphone 16"));

		long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
		System.out.println("Invocation returned after " + retrievalTime + " msecs");

		System.out.println("number of core" + Runtime.getRuntime().availableProcessors());
	}

	private static List<String> findPrices(String productName) {
		return ShopsList.shops.stream()
				.peek(e -> System.out.println("name of Thread: "+ Thread.currentThread().getName()))
				.map(shop -> shop.getPriceNewFormat(productName))
				.map(newformatPrice -> Quote.parse(newformatPrice))
				.map(quote -> Discount.applyDiscount(quote))
				.toList();
	}

	private static List<String> findPricesStreamParallel(String productName) {
		return ShopsList.shops.stream().parallel()
				.peek(e -> System.out.println("name of Thread: "+ Thread.currentThread().getName()))
				.map(shop -> shop.getPriceNewFormat(productName))
				.map(newformatPrice -> Quote.parse(newformatPrice))
				.map(quote -> Discount.applyDiscount(quote))
				.toList();
	}

	private static List<String> findPricessCompletableFuture(String productName) {

		List<CompletableFuture<String>> priceFutures = ShopsList.shops.stream()
				.map(shop -> CompletableFuture
				.supplyAsync(() -> shop.getPriceNewFormat(productName)))
				.map(future -> future.thenApply(priceNewFormat -> Quote.parse(priceNewFormat)))
				.map(future-> future.thenCompose(quote -> CompletableFuture.supplyAsync( () -> Discount.applyDiscount(quote) )))
				.toList();

		return priceFutures.stream().map(CompletableFuture::join).toList();
	}
	
	
	
	private static List<String> findPriceRochaCompletableFuture( String productName){
		
		List<CompletableFuture<String>> priceFutures =  ShopsList.shops.stream()
		.map(shop -> CompletableFuture.supplyAsync(() -> shop.getPriceNewFormat(productName))) // new Thread
		.map(future -> future.thenApply(priceNewFormat -> Quote.parse(priceNewFormat))) // same thread
		.map(future -> future.thenCompose(quote -> CompletableFuture.supplyAsync( () -> Discount.applyDiscount(quote)))) // new Thread
		.toList();
		
		return priceFutures.stream().map(CompletableFuture::join).toList();
		
	}
	
	private static List<String> findRochaPrice(String productName){
		
		List<CompletableFuture<String>> priceFutuere = ShopsList.shops.stream().map(shop -> CompletableFuture.supplyAsync(() -> String.format("%s price %.2f", shop, shop.getPrice(productName)))).toList();
		
		return priceFutuere.stream().map(future -> future.join()).toList();
	}
	
	
	private static List<String> findPricessWithExecutor(String productName) {

		var priceFutures = ShopsList.shops.stream().map(shop -> CompletableFuture
				.supplyAsync(() -> String.format("%s price %.2f", shop, shop.getPrice(productName)) , ShopsList.executor))
				.toList();

		return priceFutures.stream().map(CompletableFuture::join).toList();
	}
}
