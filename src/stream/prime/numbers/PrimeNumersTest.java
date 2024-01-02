package stream.prime.numbers;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

public class PrimeNumersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(partitionPimers(100));
		System.out.println(isPrime(89));
		
		Stream.iterate(1L, (i) -> i+1);
		
		
		
		
	}

	public static Map<Boolean, List<Integer>> partitionPimers(int n) {

		return IntStream.rangeClosed(2, n).boxed().collect(partitioningBy(candidate -> isPrime(candidate)));
	}

	public static boolean isPrime( int candidate){
		  int candidateRoot = (int) Math.sqrt((double)candidate);
		  System.out.println("CandidateRoot : "+candidateRoot);
		  return IntStream.rangeClosed(2, candidateRoot)
				  .peek(e -> System.out.println("e: "+ e + "==> " + candidate+ "%" +e + "=="+ candidate %e ))
				  .noneMatch(i -> candidate%i == 0);
		}

}
