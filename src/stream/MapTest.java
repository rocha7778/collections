package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3);

		list.stream().map(n -> n * n).forEach(i -> System.out.println("number" + i));

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(1, 2);

		List<int[]> pairs = list1.stream().
		flatMap(i -> list2.stream().map(j -> new int[] { i, j }))
		.collect(Collectors.toList());
		
		System.out.println("Pairs"+pairs);
		
		int result = list1.stream().reduce(0, (a,b)->a+b);
		
		
		System.out.println(result);
		
		

	}

}
