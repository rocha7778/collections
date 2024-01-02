package collection.framework;

import java.util.List;

public class ArraListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = List.of(1,2,3);
		
		int [] factor = new int[] {2};
		
		var stream= numbers.stream().map(n -> n* factor[0]);
		
		factor[0] = 0;

		
		stream.forEach(System.out::println);
		
		

	}

}
