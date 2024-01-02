package stream;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class IterateExample {

	public static void main(String[] args) {

		AtomicInteger counter = new AtomicInteger(1);

		UnaryOperator<Integer> inc = e -> e + 1;
		Integer seed = Integer.valueOf(1);

		Stream.iterate(seed, inc).limit(10).forEach(System.out::println);
		Stream.generate(() -> counter.getAndIncrement()).limit(10).forEach(System.out::println);

	}

}
