package Threads.callable.v2;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import Threads.callable.v2.third.part.Discount;
import Threads.callable.v2.third.part.Quote;

public class MyShopV3 {

	private String name;

	public String getName() {
		return name;
	}

	public MyShopV3(String name) {
		super();
		this.name = name;
	}

	public List<String> finderPrices(String product) {
		return ShopsList.shops.stream().map(shop -> shop.getPrice(product)).map(Quote::parse)
				.map(Discount::applyDiscount).toList();
	}

	public List<String> finderPricesParallelStream(String product) {
		return ShopsList.shops.stream().parallel().map(shop -> shop.getPrice(product)).map(Quote::parse)
				.map(Discount::applyDiscount).toList();
	}

	public List<String> finderPricesCompletableFuture(String product) {
		List<CompletableFuture<String>> result = ShopsList.shops.stream()
				.map(shop -> CompletableFuture.supplyAsync(() -> shop.getPrice(product), ShopsList.executor))
				.map(future -> future.thenApply(Quote::parse))
				.map(future -> future.thenCompose(quote ->
				               CompletableFuture.supplyAsync(
				            		   () -> Discount.applyDiscount(quote), 
				            		   ShopsList.executor))).toList();

		return result.stream().map(CompletableFuture::join).toList();

	}
	
	public Stream<CompletableFuture<String>> finderPricesStream(String product) {
		return  ShopsList.shops.stream()
				.map(shop -> CompletableFuture.supplyAsync(() -> shop.getPrice(product), ShopsList.executor))
				.map(future -> future.thenApply(Quote::parse))
				.map(future -> future.thenCompose(quote ->
				               CompletableFuture.supplyAsync(
				            		   () -> Discount.applyDiscount(quote), 
				            		   ShopsList.executor)));

		

	}

}
