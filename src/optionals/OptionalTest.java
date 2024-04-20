package optionals;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

		List<Optional<Integer>> optionalList = List.of(
				Optional.of(1),
				Optional.empty(),
				Optional.of(2),
				Optional.empty(),
				Optional.of(3));
		
		
		optionalList
		.stream()
		.forEach(e -> e.ifPresentOrElse(n -> System.out.println(e.get()), () ->System.out.println("Empty")));
		
		
		optionalList
		.stream()
		.map(e -> e.or( () -> Optional.of(0)))
		.forEach(e -> System.out.println(e.get()));
		
		optionalList
		.stream()
		.filter(Optional::isPresent)
		.map(Optional::get)
		.forEach(System.out::println);
		
		optionalList.stream()
		.flatMap(Optional::stream)
		.forEach(System.out::println);
		
		Iterator<Optional<Integer>> hola = optionalList.iterator();
		
		while(hola.hasNext()) {
			var hi = hola.next();
			System.out.println("printing using iterator: " + hi);
			
		}
		
		
		
		

	}

}
