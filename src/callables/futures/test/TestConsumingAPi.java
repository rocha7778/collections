package callables.futures.test;

import java.text.NumberFormat;
import java.util.concurrent.ExecutionException;

public class TestConsumingAPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start = System.currentTimeMillis();

		FinderBestPrices finder = new FinderBestPrices();
		var result = finder.getBestPriceAsync("Adidas");
		System.out.println(finder.getBestPrice("Adidas"));
		

		long end = System.currentTimeMillis();
		NumberFormat number = NumberFormat.getInstance();
		

		System.out.println("Time consume " + number.format(end - start));

		System.out.println("HolA");
		
		
		start = System.currentTimeMillis();

		
		try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		end = System.currentTimeMillis();
		number = NumberFormat.getInstance();
		

		System.out.println("Time consume " + number.format(end - start));

	}

}
