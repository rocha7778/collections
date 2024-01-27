package stream;

import java.nio.charset.Charset;
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
	
	System.out.println("result :" +result);
	
	
	System.out.println(Stream.of("Ken", "Jeff", "Ellen")
	.map(e -> e.chars())
	.flatMap(intStream -> intStream.mapToObj(j -> (char) j))
	.filter(ch -> ch=='e' || ch =='E' )
	.count());
	
	
	
	Stream.of("Ken", "Jeff", "Ellen")
	.map(e -> e.chars())
	.flatMap(intStream -> intStream.mapToObj(j -> (char) j))
	.filter(ch -> ch=='e' || ch=='E')
	.forEach(System.out::println);

	}

}
