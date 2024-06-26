package Threads.callable.v2.third.part;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

public class Util {
	
	private static final DecimalFormat formatter = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
	private static Random random = new Random();
	
	public static void delay() {
		int delay = 1000;
		// int delay = 500 + RANDOM.nextInt(2000);
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public static void randomDelay() {
		
		 int delay = 500 + random.nextInt(2000);
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public static double format(double number) {
		synchronized (formatter) {
			return Double.valueOf(formatter.format(number));
		}
	}

}
