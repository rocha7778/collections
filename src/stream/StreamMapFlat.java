package stream;

import java.util.Arrays;
import java.util.List;

public class StreamMapFlat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		
		colors.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
		
		
		List<Integer> list1 = List.of(1,2,3);
		List<Integer> list2 = List.of(1,2);
		
		List<int[]> result =   list1.stream().flatMap(i -> list2.stream().map( j -> new int[] {i,j})).toList();
		
		List<int[]> result2 =  list1.stream().flatMap(i -> list2.stream().filter(j -> (i+j)%3==0).map(j -> new int[] {i,j})).toList();
		
		
		
		
		for (int[] pair : result) {
		    System.out.println(Arrays.toString(pair));
		}
		
		System.out.println("Divisible by 3");
		
		for (int[] pair : result2) {
		    System.out.println(Arrays.toString(pair));
		}
		
		
		
		
		

	}

}
