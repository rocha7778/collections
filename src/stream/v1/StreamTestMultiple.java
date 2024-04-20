package stream.v1;

import java.util.Arrays;
import java.util.List;

public class StreamTestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		var result = list.stream().reduce(0,(a,b)-> a+b);
		var resultOptional = list.stream().reduce((a,b)-> a+b);
		
		System.out.println(result);
		System.out.println(resultOptional);
		
		
		 

	}

}
