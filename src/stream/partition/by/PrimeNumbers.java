package stream.partition.by;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Partitioning by normal");
		partitionPrimes(20);
	}
	
	public static void partitionPrimesClose(int n) {
		var result = IntStream.rangeClosed(2, n)
				.boxed().collect(
						Collectors.partitioningBy(i -> isPrimeClose(i)));
		System.out.println(result);
	}
	
	private static void partitionPrimes(int n) {
		var result = IntStream.rangeClosed(2, n)
				.boxed()
				.collect(Collectors.partitioningBy(PrimeNumbers::isPrime));
		
		System.out.println(result);
	}
	
	public static boolean isPrimeClose(int candidate) {
		int rootCandidate = (int)Math.sqrt(candidate);
		return IntStream.rangeClosed(2, rootCandidate)
				.noneMatch(i -> candidate % i == 0);
	}
	
	public static boolean isPrime(int candidate) {
		int rootCandidate = (int)Math.sqrt(candidate);
		return IntStream.rangeClosed(2, rootCandidate)
				.noneMatch(i -> candidate % i ==0);
		
	}
}
