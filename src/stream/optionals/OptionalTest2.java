package stream.optionals;

import java.util.List;
import java.util.Optional;

public class OptionalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Optional<Integer>> optionalList = List.of(
				Optional.of(1),
				Optional.empty(),
				Optional.of(2),
				Optional.empty(),
				Optional.of(3));
		
		
		optionalList.stream().forEach(e -> e.ifPresentOrElse(n -> System.out.println(n), () -> System.out.println("Empty")));
		
		System.out.println("----------------------");
		
		optionalList
		.stream()
		.map(e -> e.or(() -> Optional.of(0)))
		.forEach(e -> System.out.println(e.get()));
		
		System.out.println("----------------------");
		
		optionalList
		.stream()
		.filter(Optional::isPresent)
		.map(Optional::get)
		.forEach(System.out::println);
		
		
		System.out.println("----------Optional Stream------------");
		optionalList
		.stream()
		.flatMap(Optional::stream)
		.forEach(System.out::println);;
		
		
		
//		optionalList
//		.stream()
//		.filter(Optional::isPresent)
//		.map(Optional::get)
//		.forEach(System.out::println);
		
		
		

	}

}
