package callables.futures.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class FinderBestPrices {

	public static List<Shop> shops = Arrays.asList(
			new Shop("BestPrice"), 
			new Shop("LetsSaveBig"), 
			new Shop("MyFavoriteShop"),
			new Shop("BuyItAl"),
			new Shop("Amazon"),
			new Shop("Google"),
			new Shop("HP"),
			new Shop("DELL"),
			new Shop("BestPrice"), 
			new Shop("LetsSaveBig"), 
			new Shop("MyFavoriteShop"),
			new Shop("BuyItAl"),
			new Shop("Amazon"),
			new Shop("Google"),
			new Shop("HP"),
			new Shop("DELL"));

	

	public List<String> findPricesParallelStream(String productName) {
		return shops
				.stream()
				.parallel()
				.map(FinderBestPrices::calculatePrice)
				.toList();
	}
	
	public Future<Integer> getBestPriceAsync(String productName) {
		CompletableFuture<Integer> futurePrice = new CompletableFuture<>();

		new Thread(() -> {
			try {
				int price = getBestPrice(productName);
				futurePrice.complete(price);
			} catch (Exception e) {
				futurePrice.completeExceptionally(e);
			}

		}).start();

		return futurePrice;

	}
	
	public static Integer getBestPrice(String productName) {
		Random random = new Random();
		delay();
		return random.nextInt() * productName.charAt(0) + productName.charAt(1);

	}



	public List<CompletableFuture<String>> findPricesAnsync(String productName) {
		return shops.stream()
				.map(shop -> CompletableFuture.supplyAsync(() -> calculatePrice(shop)))
				.toList();
	}
	
	public List<CompletableFuture<String>> findPricesAnsync(String productName, Executor executor) {
		return shops.stream()
				.map(shop -> CompletableFuture.supplyAsync(priceSupplier(shop), executor))
				.toList();
	}
	
	public static Supplier<String> priceSupplier(Shop shop){
		return () -> calculatePrice(shop);
	}

	public static String calculatePrice(Shop shop) {
		String productName = shop.getProductName();
		return String.format("%s price is %d", productName, getBestPrice(productName));
	}

	public static void delay() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
