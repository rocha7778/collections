package stream.fork.join.framework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class ForkJointTest {

	public static void main(String[] args) {

		System.out.println(forkJoinSum(10_000_000));
		
		
		
	}
	
	private static long forkJoinSum(long n) {
	    long[] numbers = LongStream.rangeClosed(1, n).toArray();
	    ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
	    return new ForkJoinPool().invoke(task);
	}

}
