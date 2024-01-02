package stream;

import java.util.List;
import java.util.stream.Collectors;

public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listNumbers = List.of(1,2,3,4);
		
		var total = listNumbers.stream().collect(Collectors.reducing(0, (i,j) -> i+j));
		var total2 = listNumbers.stream().mapToInt(e-> e).sum();
		System.out.println(total);
		System.out.println(total2);
		
		
	}

}
