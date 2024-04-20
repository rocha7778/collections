package Threads.callable.v3;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MyShop {

	public static void main(String[] args) {

		long start = System.nanoTime();
		System.out.println(findPricessWithExecutor("Iphone 16"));

		long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
		System.out.println("Invocation returned after " + retrievalTime + " msecs");

		System.out.println("number of core" + Runtime.getRuntime().availableProcessors());
	}

	private static List<String> findPrices(String productName) {
		return ShopsList.shops.stream()
				.map(shop -> String.format("%s prices is %.2f", shop.getName(), shop.getPrice(productName))).toList();
	}

	private static List<String> findPricesStreamParallel(String productName) {
		return ShopsList.shops.stream().parallel()
				.map(shop -> String.format("%s prices is %.2f", shop.getName(), shop.getPrice(productName))).toList();
	}

	private static List<String> findPricessCompletableFuture(String productName) {

		var priceFutures = ShopsList.shops.stream().map(shop -> CompletableFuture
				.supplyAsync(() -> String.format("%s price %.2f", shop, shop.getPrice(productName)))).toList();

		return priceFutures.stream().map(CompletableFuture::join).toList();
	}
	
	
	private static List<String> findPricessWithExecutor(String productName) {

		var priceFutures = ShopsList.shops.stream().map(shop -> CompletableFuture
				.supplyAsync(() -> String.format("%s price %.2f", shop, shop.getPrice(productName)) , ShopsList.executor)).toList();

		return priceFutures.stream().map(CompletableFuture::join).toList();
	}
}
