package stream.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AvarageOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		double average = list.stream().collect(Collectors.averagingDouble(Integer::doubleValue));
		
		 var result = list.stream().reduce(0, (a,b)->a+b);
		 
		 System.out.println(result);
		
		
		
	}

}
