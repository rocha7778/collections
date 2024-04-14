package collection.framework.collectors.team;

import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(isPrimeStream(101));
		
		IntStream.rangeClosed(2, 101).boxed().collect(
				Collectors.partitioningBy(PrimeNumberV2::isPrimeStream))
		        .forEach((k,v) -> System.out.println("key " +k + " value "+v));

	}
	

	
	public static boolean isPrimeStream(int number) {
		int candidateRoot = (int) Math.sqrt((double)(number));
		return IntStream.range(2, candidateRoot).noneMatch(i -> number%i==0);
	}

}
