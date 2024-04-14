package Threads.callable.v2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import Threads.callable.v2.third.part.Shop;

public class ShopsList {

private ShopsList() {}
	
	public static final List<Shop> shops = Arrays.asList(
		    new Shop("Amazon"),
		    new Shop("eBay"),
		    new Shop("Alibaba"),
		    new Shop("Walmart"),
		    new Shop("Target"),
		    new Shop("Best Buy"),
		    new Shop("Etsy"),
		    new Shop("ASOS"),
		    new Shop("Zappos"),
		    new Shop("Overstock"),
		    new Shop("Newegg"),
		    new Shop("Wayfair"),
		    new Shop("Etsy"),
		    new Shop("Rakuten"),
		    new Shop("Shopify"),
		    new Shop("Costco"),
		    new Shop("Macy's"),
		    new Shop("Nordstrom"),
		    new Shop("Flipkart"),
		    new Shop("Snapdeal"),
		    new Shop("Taobao"),
		    new Shop("Tmall"),
		    new Shop("JD.com"),
		    new Shop("Lazada"),
		    new Shop("AliExpress"),
		    new Shop("Home Depot"),
		    new Shop("Lowe's"),
		    new Shop("IKEA"),
		    new Shop("QVC"),
		    new Shop("H&M"),
		    new Shop("Forever 21"),
		    new Shop("GameStop"),
		    new Shop("Nike"),
		    new Shop("Adidas"),
		    new Shop("ASICS"),
		    new Shop("Under Armour"),
		    new Shop("Puma"),
		    new Shop("Gap"),
		    new Shop("Old Navy"),
		    new Shop("Banana Republic"),
		    new Shop("Zara"),
		    new Shop("Uniqlo"),
		    new Shop("Sephora"),
		    new Shop("Ulta"),
		    new Shop("CVS"),
		    new Shop("Walgreens"),
		    new Shop("Boots"),
		    new Shop("Sainsbury's"),
		    new Shop("Tesco")
		);
	
	
	public static final Executor executor = Executors.newFixedThreadPool(Math.min(shops.size(), 100),
			new ThreadFactory() {

				public Thread newThread(Runnable r) {

					Thread t = new Thread(r);
					t.setDaemon(true);
					return t;
				}
			});


}
