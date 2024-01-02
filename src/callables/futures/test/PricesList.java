package callables.futures.test;

import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class PricesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Executor executor = Executors.newFixedThreadPool(FinderBestPrices.shops.size(), new ThreadFactory() {

			public Thread newThread(Runnable r) {
				Thread t = new Thread(r);
				t.setDaemon(true);
				return t;
			}
		});

		long start = System.currentTimeMillis();

		FinderBestPrices finder = new FinderBestPrices();

		List<String> listPrices = finder.findPricesParallelStream("rocha");

		long end = System.currentTimeMillis();
		NumberFormat number = NumberFormat.getInstance();
		
		listPrices.forEach(System.out::println);

		System.out.println("Time consume parallel " + number.format(end - start));

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		

		start = System.currentTimeMillis();

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		List<CompletableFuture<String>> list = finder.findPricesAnsync("rocha");
		list.stream().map(CompletableFuture::join).toList().forEach(System.out::println);

		end = System.currentTimeMillis();

		System.out.println("Time consume comletable future" + number.format(end - start));

		
		start = System.currentTimeMillis();

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		list = finder.findPricesAnsync("rocha", executor);
		list.stream().map(CompletableFuture::join).toList().forEach(System.out::println);

		end = System.currentTimeMillis();

		System.out.println("Time consume comletable future + executor" + number.format(end - start));

	}

}
