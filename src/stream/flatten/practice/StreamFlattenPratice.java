package stream.flatten.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlattenPratice {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Hello","World");

       list.stream().flatMap(
		s -> Arrays.stream(s.split("")))
		.distinct()
		.forEach(System.out::println);

		System.out.println("Solucion 32");
		list.stream()
		.map(s -> s.split(""))
		.flatMap(Arrays::stream)
		.distinct()
		.forEach(System.out::println);
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(3,4);
		
		// result (1,3)(1,4)(2,3)(2,4),(3,3)(3,4)
		
		//list1.stream().map(i -> list2.stream().flatMap(new int[] {i,j})).toList();

         list1.stream()
		 .flatMap(i -> list2.stream().map(j -> new int[] {i,j}))
		 .forEach(array -> System.out.println("("+ array[0]+","+array[1] + ")") );

		 System.out.println("Divisible by 3");

		 list1.stream()
		 .flatMap(i -> list2.stream()
		 .filter(j -> (i+j)%3==0)
		 .map(j -> new int[] {i,j}))
		 .forEach(array -> System.out.println("("+ array[0]+","+array[1] + ")") );


	}

}
