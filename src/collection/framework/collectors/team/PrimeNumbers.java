package collection.framework.collectors.team;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

	public static void main(String[] args) {

		System.out.println("Partitioning by closed");
		partitionPrimesClose(20);
	}
	
	public static void partitionPrimesClose(int n) {
		var result = IntStream.rangeClosed(2, n).boxed().collect(Collectors.partitioningBy(i -> isPrimeClose(i)));
		System.out.println(result);
	}

	
	
	public static boolean isPrimeClose(int candidate) {
		int rootCandidate = (int)Math.sqrt(candidate);
		return IntStream.rangeClosed(2, rootCandidate).noneMatch(i -> candidate % i == 0);
	}
	
	

}
