package Threads.callable.v2;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MyShop {

	private String name;

	public String getName() {
		return name;
	}

	public MyShop(String name) {
		super();
		this.name = name;
	}

	public List<String> finderPrices(String product) {
		return ShopsList.shops.stream()
				.map(shop -> String.format("%s price is %.2f", shop.getName(), shop.getPrice(product))).toList();
	}

	public List<String> finderPricesParallelStream(String product) {
		return ShopsList.shops.stream().parallel()
				.map(shop -> String.format("%s price is %.2f", shop.getName(), shop.getPrice(product))).toList();
	}

	public List<String> finderPricesCompletableFuture(String product) {
		List<CompletableFuture<String>> result = ShopsList.shops.stream()
				.map(shop -> CompletableFuture
						.supplyAsync(
								() -> String.format("%s price is %.2f", shop.getName(), shop.getPrice(product)),
								ShopsList.executor
								)).toList();
		
		return result.stream().map(CompletableFuture::join)
		.toList();
				

	}

}
