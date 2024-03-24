package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []numbers = {1,2,3,4};
		
		//IntStream hola = Arrays.stream(numbers);
		
		Stream<int[]> ints = Stream.of(numbers);
		ints.flatMap(n -> Arrays.stream(n).boxed()).forEach(System.out::println);
		
		 Stream<Integer> integerStream = ints.flatMapToInt(Arrays::stream)
                 .boxed();
		
		
		
		

	}

}
