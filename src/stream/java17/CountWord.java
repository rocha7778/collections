package stream.java17;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountWord {

	public static void main(String[] args) {

		
		var count = Stream.of("Ken", "Jeff", "Ellen")
				.map(s -> s.chars())
				.flatMap(intStream -> intStream.mapToObj(n -> ((char)n)))
				.filter(ch -> ch=='e' || ch=='E')
				.count();
				
		
		String[] hola = "hola".split("");
		

	}

}
