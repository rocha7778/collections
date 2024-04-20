package stream.pratice;

import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		 Stream.iterate(0, n->n+1).map(n -> new int[] {n,n+1})
		 .map(arr -> new int[] {arr[0], arr[1]})
		 .limit(10)
		 .forEach(t -> System.out.println(t[0] + ", " + t[1] ));
		 
		 
		 System.out.println("Fibonacci");
		 Stream.iterate(new int[] {0,1}, t -> new int[] {t[1], t[0]+t[1]})
		 .limit(10)
		 .forEach(t -> System.out.println(t[0] + ", " + t[1] ));
		 

	}

}
