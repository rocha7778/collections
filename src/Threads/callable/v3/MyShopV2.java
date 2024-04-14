package Threads.callable.v3;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import Threads.callable.v3.third.part.Discount;
import Threads.callable.v3.third.part.Quote;
import Threads.callable.v3.third.part.Shop;

public class MyShopV2 {

	public static void main(String[] args) {

		long start = System.nanoTime();
		System.out.println(findPricessWithExecutor("Iphone 16"));

		long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
		System.out.println("Invocation returned after " + retrievalTime + " msecs");

		System.out.println("number of core" + Runtime.getRuntime().availableProcessors());
	}

	private static List<String> findPrices(String productName) {
		return ShopsList.shops.stream()
				.map(shop -> shop.getPriceNewFormat(productName))
				.map(shop -> Quote.parse(shop))
				.map(shop ->Discount.applyDiscount(shop))
				.toList();
	}

	private static List<String> findPricesStreamParallel(String productName) {
		return ShopsList.shops.stream().parallel()
				.map(shop -> shop.getPriceNewFormat(productName))
				.map(shop -> Quote.parse(shop))
				.map(shop ->Discount.applyDiscount(shop))
				.toList();
	}

	private static List<String> findPricessCompletableFuture(String productName) {

		var priceFutures = ShopsList.shops.stream()
				.map(shop -> CompletableFuture.supplyAsync(() -> shop.getPriceNewFormat(productName))).toList();

		return priceFutures.stream().map(CompletableFuture::join).toList();
	}
	
	
	private static List<String> findPricessWithExecutor(String productName) {

		var priceFutures = ShopsList.shops.stream()
				.map(shop -> getPriceFormatted(shop, productName)) // asynchronous
				.map(future -> future.thenApply(Quote::parse)) // synchronous
				.map(future -> future.thenCompose(MyShopV2::applyDiscount)) // asynchronous
				.toList();

		return priceFutures.stream().map(CompletableFuture::join).toList();
	}
	
	private static CompletableFuture<String> applyDiscount(Quote quote) {
		return CompletableFuture.supplyAsync(()-> Discount.applyDiscount(quote), ShopsList.executor);
		
	}
	
	private static CompletableFuture<String> getPriceFormatted(Shop shop, String productName){
		return CompletableFuture.supplyAsync(() -> shop.getPriceNewFormat(productName) , ShopsList.executor);
	}
}
