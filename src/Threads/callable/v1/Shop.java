package Threads.callable.v1;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Shop {

	private String name;
	private  List<Shop> shops = ShopsList.shops;


	public Shop(String name) {
		super();
		this.name = name;
	}

	public double getPrice(String name) {
		return calculatePrice(name);
	}

	public String getName() {
		return name;
	}

	public Future<Double> getPriceAsync(String productName) {
		CompletableFuture<Double> futurePrice = new CompletableFuture<>();

		new Thread(() -> {
			try {
				double price = calculatePrice(productName);
				futurePrice.complete(price);
			} catch (Exception e) {
				futurePrice.completeExceptionally(e);
			}

		}).start();
		return futurePrice;
	}

	public Future<Double> getPriceAsyncEnhance(String productName) {
		return CompletableFuture.supplyAsync(() -> calculatePrice(productName));
	}

	private double calculatePrice(String nameOfProduct) {

		delay();
		Random random = new Random();

		return random.nextDouble() * nameOfProduct.charAt(0) + nameOfProduct.charAt(1);
	}

	public void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public List<String> findPrices(String productName) {

		return shops.stream().map(shop -> String.format("%s price is %.2f", shop.getName(), shop.getPrice(productName)))
				.collect(Collectors.toList());

	}

	public List<String> findPricesParallelStream(String productName) {
		return shops.stream().parallel()
				.map(shop -> String.format("%s price is %.2f", shop.getName(), shop.getPrice(productName)))
				.collect(Collectors.toList());
	}

	public List<String> findPricesCompletableFuture(String productName) {

		List<CompletableFuture<String>> prices = shops.stream().map(shop -> CompletableFuture
				.supplyAsync(() -> shop.getName() + "," + "Prices is" + shop.getPrice(productName))).toList();

		return prices.stream().map(CompletableFuture::join).collect(Collectors.toList());

	}
	
	public List<String> findPricesCompletableFutureUsingExecutor(String productName) {

		List<CompletableFuture<String>> prices = shops.stream().map(shop -> CompletableFuture
				.supplyAsync(() -> shop.getName() + "," + "Prices is" + shop.getPrice(productName), ShopsList.executor)).toList();

		return prices.stream().map(CompletableFuture::join).collect(Collectors.toList());

	}

}
