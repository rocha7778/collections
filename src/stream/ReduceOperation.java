package stream;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class ReduceOperation {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> sum = (a,b) -> a+b;
		
		List<Integer> list = IntStream.rangeClosed(0, 1000).boxed().toList();
		var result = list.stream().reduce(0, sum);
		var result2 = list.stream().reduce(0, Integer::sum);
		System.out.println(result);
		System.out.println(result2);
		
		Optional<Integer> max = list.stream().reduce(Integer::min);
		Optional<Integer> min = list.stream().reduce(Integer::max);
	}

}
