package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AvarageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,1,2);
		
		var total = list.stream().reduce(0, (a,b) -> a + b);
		var total2 = list.stream().reduce(0, Integer::sum);
		
		var total3 = list.stream().collect(Collectors.reducing(0, Function.identity(), (i,j) -> i+j));
		
		System.out.println("Total3 ROCHA"+total3);
		
		var max = list.stream().reduce(Integer::max);
		
		System.out.println("total: " + total);
		System.out.println("total2: " + total2);
		System.out.println("max : " + max);

		Double avg = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0);

		System.out.println("Avarage of -->" + avg);

		List<String> listString = Arrays.asList("hola", "pedor");

		listString.stream().map(String::toUpperCase).forEach(System.out::println);

		BinaryOperator<Integer> t = (a, b) -> a + b;
		Predicate<Integer> evenNumber =  y -> y % 2 == 0;


		Integer totalOdd = list.stream().filter(evenNumber.negate()).reduce(0, t);
		Integer totalEven = list.stream().filter(evenNumber).reduce(0, t);
		
		
		
		

		// 0, (subtotal, element) -> subtotal + element

		System.out.println("Sum of odd ->" + totalOdd);
		System.out.println("Sum of even ->" + totalEven);
		
		list.stream().distinct().forEach(System.out::println);
		
		

	}

}
