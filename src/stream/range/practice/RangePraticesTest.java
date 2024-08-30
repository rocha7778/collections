package stream.range.practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangePraticesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.iterate(1, n -> n+1)
		.limit(10)
		.forEach(System.out::println);
		
		System.out.println("RangeClosed");
		IntStream.rangeClosed(1, 10)
		.forEach(System.out::println);
		
		System.out.println("Iterate");
		Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
        .limit(10)
        .map(n -> n[0])
        .forEach(System.out::println);
		
		System.out.println("Generate");
		Stream.generate(Math::random)
		.limit(5)
		.forEach(System.out::println);

	}

}
