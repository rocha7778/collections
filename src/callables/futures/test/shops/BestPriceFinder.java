package callables.futures.test.shops;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Collectors;



public class BestPriceFinder {

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
	
	private final Executor executor = Executors.newFixedThreadPool(shops.size(), new ThreadFactory() {
		@Override
		public Thread newThread(Runnable r) {
			Thread t = new Thread(r);
			t.setDaemon(true);
			return t;
		}
	});
	
	
	
	public List<String> findPricesSequential(String product) {
        return shops.stream()
                .map(shop -> shop.getPrice(product))
                .map(Quote::parse)
                .map(Discount::applyDiscount)
                .collect(Collectors.toList());
    }

}
