package stream.compression;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import stream.java17.PrimeNumberUtility;

public class PimeUtilMain {

	public static void main(String[] args) {

		Stream.iterate(2L, PrimeNumberUtility::next)
		      .limit(10)
		      .forEach(System.out::println);
		
		System.out.println("----------------------");
		
		Stream.iterate(1L, n->n+1)
		       .filter(PrimeNumberUtility::isPrime)
		       .limit(10)
		       .forEach(System.out::println);
		
		
		System.out.println("----------------------");
		Stream.iterate(1L, n->n+1)
	       .filter(PrimeNumberUtility::isPrime)
	       .skip(3000)
	       .limit(5)
	       .forEach(System.out::println);
		
		
		System.out.println("----------- using Random()::nextInt -----------");
		IntStream.generate(new Random()::nextInt)
	       .limit(5)
	       .forEach(System.out::println);
	}
	

}
