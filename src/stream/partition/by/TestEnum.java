package stream.partition.by;

import java.util.HashMap;
import java.util.Map;

public class TestEnum {

	public static void main(String[] args) {
		System.out.println(Gender.GIRL.getValue());

		// 1 BABBIES
		// 2 KIDS
		// 3 ADULTS

		Map<Integer, Double> ages = new HashMap<>();
		ages.put(1, 0.0);
		ages.put(2, 0.0);
		ages.put(3, 100.0);
		
		var maxVaue = ages
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.map(entry -> entry.getKey())
				.orElse(1);
	}
}
