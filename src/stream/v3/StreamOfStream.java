package stream.v3;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOfStream {

	public static void main(String[] args) {
	 
	 
	 Stream.of(1, 2, 3)
	 .flatMap(n -> Stream.of(n,n*n))
	 .forEach(System.out::println);
	 
	
	 
	 long result =  Stream.of("Ken", "Jeff", "Ellen")
				.flatMap(e -> Arrays.stream(e.split("")))
				.filter(e -> e.contains("e"))
				.count();
	 
	 
	 System.out.println("Number of es"+result);

	}
	
	
	

}
