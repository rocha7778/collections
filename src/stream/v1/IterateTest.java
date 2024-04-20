package stream.v1;

import java.util.Arrays;
import java.util.function.IntSupplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IterateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<Integer> increment = x -> x + 1;
		
		//Stream.iterate(1, increment).limit(10).forEach(System.out::println);
		
		// fibonaccy 0 1 1 2 3
		
		UnaryOperator<int[]> fibonacy = t -> new int[] {t[1], t[0]+t[1]};
		
		Stream.iterate(new int[] {0,1}, fibonacy ).limit(5).forEach(t -> System.out.println(Arrays.toString(t)));
		
		IntSupplier fib = new IntSupplier() {
			
			private int previous =0;
			private int current = 1;
			
			@Override
			public int getAsInt() {
				int oldPrevious = this.previous;
				int nextValue = this.previous + this.current;
				this.previous =  this.current;
				this.current = nextValue;
				return oldPrevious;
			}
		};
		
		
		System.out.println("Using generate");
		IntStream.generate(fib).limit(10).forEach(System.out::println);
		

	}

}
