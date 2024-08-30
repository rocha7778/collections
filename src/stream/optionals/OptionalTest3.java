package stream.optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Optional<Integer>> optionalList = List.of(
				Optional.of(1),
				Optional.empty(),
				Optional.of(2),
				Optional.empty(),
				Optional.of(3));
		
		
		Thread thread = new Thread(null, null, null, 0);
		List<Integer> numbers = new ArrayList<>();
		
		numbers.getFirst();
		
		
		optionalList.stream().filter(op -> op.isPresent()).forEach(System.out::println);
		
		System.out.println("----------------------");
		
		optionalList.stream()
		.filter(Optional::isPresent)
		.map(Optional::get)
		.forEach(System.out::println);
		
		System.out.println("----------------------");
		optionalList
		.stream()
		.flatMap(Optional::stream)
		.forEach(System.out::println);
		;
		
		

	}

}
