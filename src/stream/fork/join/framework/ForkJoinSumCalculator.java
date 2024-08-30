package stream.fork.join.framework;

import java.util.concurrent.RecursiveTask;

public class ForkJoinSumCalculator extends RecursiveTask<Long> {

	private static final long serialVersionUID = 1L;

	public static final long THRESHOLD = 10_000;

	private final long[] numbers;
	private final int start;
	private final int end;

	public ForkJoinSumCalculator(long[] numbers) {
		this(numbers, 0, numbers.length);
	}

	private ForkJoinSumCalculator(long[] numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Long compute() {

		int length = end - start;
		if (length <= THRESHOLD) {
			return computeSequentially();
		}

		int endLeftList = start + length / 2;
		ForkJoinSumCalculator leftTask = 
				new ForkJoinSumCalculator(numbers, start, endLeftList);
		
		leftTask.fork();
		
		int startMiddleRightList = endLeftList;
		
		ForkJoinSumCalculator rightTask = 
				new ForkJoinSumCalculator(numbers, startMiddleRightList, end);
		
		Long rightResult = rightTask.compute();
		Long leftResult = leftTask.join();
		return leftResult + rightResult;
	}

	private long computeSequentially() {
		long sum = 0;
		for (int i = start; i < end; i++) {
			sum += numbers[i];
		}
		return sum;
	}

}
