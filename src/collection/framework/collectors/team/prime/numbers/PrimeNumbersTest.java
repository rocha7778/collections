package collection.framework.collectors.team.prime.numbers;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import collection.framework.collectors.team.PrimeNumbersCollector;

public class PrimeNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var result = partitionPrimeWithCustomCollector(10);
		
		System.out.println(result);

	}

	public static Map<Boolean, List<Integer>> partitionPrimeWithCustomCollector(int n) {
		return IntStream.rangeClosed(2, n).boxed().collect(new PrimeNumbersCollector());
	}

}
