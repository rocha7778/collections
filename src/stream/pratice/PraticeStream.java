package stream.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PraticeStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);

		List<int[]> result = numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[] { i, j }))
				.collect(Collectors.toList());

		result.stream().forEach(i -> System.out.println(Arrays.toString(i)));

		System.out.println("Divisible by 3");
		numbers1.stream().flatMap(i -> numbers2.stream().filter(j -> (j + i) % 3 == 0).map(j -> new int[] { i, j }))
				.forEach(i -> System.out.println(Arrays.toString(i)));
		
		
		var r = numbers1.stream().max(Integer::compareTo);
		
		var r2 = numbers1.stream().reduce(Integer::min);
		
		System.out.println(r);
		System.out.println(r2);

	}

}
