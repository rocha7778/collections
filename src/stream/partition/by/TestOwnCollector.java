package stream.partition.by;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class TestOwnCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var result = partitionPrimesWithCustomCollector(11);
		
		System.out.println(result);

	}
	
	private static Map<Boolean, List<Integer>> partitionPrimesWithCustomCollector(int candiate){
		return IntStream.range(2, candiate)
				.boxed()
				.collect(new PrimeNumbersCollecor());
	}

}
