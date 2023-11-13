package lambdasinaction.chap5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pythagoream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<int[]> pythagoreanTriples = 
				IntStream.rangeClosed(1, 100)
				.boxed()
				.flatMap(a -> IntStream.rangeClosed(a, 100)
						       .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
						       .mapToObj(b -> new int[] { a, b, (int) Math.sqrt(a * a + b * b) }));
		
		

		pythagoreanTriples.limit(5).forEach(t -> System.out.println("Triple ["+t[0]+","+ t[1]+","+ t[2]+"]"));
	}

}


