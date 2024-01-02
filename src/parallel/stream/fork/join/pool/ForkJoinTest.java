package parallel.stream.fork.join.pool;

import java.util.stream.LongStream;

public class ForkJoinTest {

	public final static long SIZE = 200_000_000;
	public static void main(String[] args) {
		
		

		Long start = System.currentTimeMillis();
		Long result = ForkJoinSumCalculator.forkJoinSum(SIZE);
		System.out.println(result);

		Long end = System.currentTimeMillis();

		System.out.println("Total time in millisecond" + (end - start));

		start = System.currentTimeMillis();
		System.out.println(computeSequentially());
		end = System.currentTimeMillis();

		System.out.println("Total time in millisecond" + (end - start));
	}

	public static long computeSequentially() {
		long[] numbers = LongStream.rangeClosed(1, SIZE).toArray();
		long sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

}
