package stream.v3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Avarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,1,2);
		
		Consumer<Object> print = System.out::println;
		
		list.stream().filter(n-> n%3==0).forEach(System.out::println);
		
		list.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
		
		System.out.println("Filtered and delete duplicates");
		
		list.stream().filter(n-> n%2==0).distinct().forEach(print);
		
		List<String> listString = Arrays.asList("hola", "pedor");
		
		listString.stream().map(String::toUpperCase).forEach(print);
		
		

	}

}
