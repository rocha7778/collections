package stream.v1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeStream {

	public static void main(String[] args) {
		IntStream.range(0, 100).filter(i -> i % 2 == 0);
		
		
		 Stream<int[]> pythagoreanTriples =
	               IntStream.rangeClosed(1, 100).boxed()
	                        .flatMap(a -> IntStream.rangeClosed(a, 100)
	                                               .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0).boxed()
	                                               .map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}));       

	     //   pythagoreanTriples.forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2])); 
	        
	        
	        Stream.iterate(0,n->n+1).map(n -> new int[] {n,n+1})
	        .map(arr -> new int[]{arr[0], arr[1]})
	        .limit(10).forEach(t -> System.out.println(t[0] + ", " + t[1] ) );
	        
	        Stream.iterate(new int[] {0,1}, t -> new int[] {t[1], t[0]+t[1]})
	        .limit(10)
	        .forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + ")"));
	        
	        
	        
	        // fibonnaci with iterate
//	        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1],t[0] + t[1]})
//	              .limit(10)
//	              .forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + ")"));
	        
	        
	}
	
	
	

}
