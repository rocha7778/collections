package stream.v1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<int[]> pitagoras = IntStream.rangeClosed(1,1000)
		.boxed()
		.flatMap(a -> IntStream.rangeClosed(a,1000)
				.filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
				.mapToObj(b -> new int[] {a,b, (int) Math.sqrt(a*a + b*b)})
				
				);
		
		
		pitagoras.limit(5).forEach(p -> System.out.println(Arrays.toString(p)));
		
		
		
		Stream<double[]> pitagoras2 = IntStream.rangeClosed(1,1000)
				.boxed()
				.flatMap(a -> IntStream.rangeClosed(a,1000)
						.mapToObj(b -> new double[] {a , b, Math.sqrt(a*a + b*b)})
						
						).filter(t -> t[2]%1==0);
      System.out.println("Optimizado");
		
		pitagoras2.limit(5).forEach(p -> System.out.println(Arrays.toString(p)));

	}

}
