package stream.java17;

public class PrimeNumberUtility {

	private long lastPrime = 0L;

	public long next() {
		lastPrime = next(lastPrime);
		return lastPrime;
	}

	public static long next(Long after) {
		long counter = after;
		while (!isPrime(++counter));
		return counter;
	}

	public static boolean isPrime(Long number) {

		if (number <= 1) {
			return false;
		}
		
		if(number == 2) {
			return true;
		}

		if (number % 2 == 0) {
			return false;
		}

		long maxdivisor = (long) Math.sqrt(number);

		for (int counter = 3; counter <= maxdivisor; counter += 2) {
			if (number % counter == 0) {
				return false;
			}
		}
		return true;
	}
}
