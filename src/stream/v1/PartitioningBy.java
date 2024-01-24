package stream.v1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lambdasinaction.chap4.Dish;
import lambdasinaction.chap4.Dish.Type;

public class PartitioningBy {

	public static void main(String[] args) {

		Map<Boolean, List<Dish>> result = Dish.menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
		System.out.println(result);

		Map<Boolean, Map<Type, List<Dish>>> result2 = Dish.menu.stream()
				.collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.groupingBy(Dish::getType)));
		System.out.println(result2);

		Map<Boolean, Dish> result3 = Dish.menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparing(Dish::getCalories)), Optional::get)));
		System.out.println(result3);

		var result4 = Dish.menu.stream().collect(
				Collectors.partitioningBy(Dish::isVegetarian, Collectors.partitioningBy(d -> d.getCalories() > 500)));

		System.out.println(result4);

		var result5 = Dish.menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.counting()));

		System.out.println(result5);
		
		Predicate<Integer> isPrime = n -> IntStream.range(2, n).noneMatch( i -> n%i==0);
		
		
		System.out.println(isPrime.test(8));
		
	    Map<Boolean, List<Integer>> resultPrimeNonPrime = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.partitioningBy(isPrime));
	    
	    
	    System.out.println(resultPrimeNonPrime);

	}

}
