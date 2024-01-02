package collection.framework.collectors.team;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import lambdasinaction.chap4.Dish;;




public class TeaingTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Integer> lits = List.of(1, 2, 3, 4, 5);
		
		

		int min = lits.stream().collect(minBy(Integer::compareTo)).get();
		int max = lits.stream().collect(maxBy(Integer::compareTo)).get();

		System.out.println("Min " + min + "," + " Max " + max);
		
		 var result= lits.stream().collect(Collectors.teeing(
				 Collectors.collectingAndThen(minBy(Integer::compareTo) , Optional::get), 
				 Collectors.collectingAndThen(maxBy(Integer::compareTo) , Optional::get),
				(value1, value2) -> new Numbers(value1, value2)));
		 
		 
//		 Dish.menu.stream()
//         .collect(
//      		   groupingBy(Dish::getType, 
//      		   Collectors.collectingAndThen(
//      				   maxBy(Comparator.comparingInt(Dish::getCalories)),
//      				   Optional::get)));
		 
		
		 System.out.println("Min " + result.min() + "," + " Max " + result.max());
		 
		 var result55 = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType));
		 var result56 = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
		 var result57 = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparing(Dish::getCalories))));
		 var result58 = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType, 
				 Collectors.collectingAndThen(
						 Collectors.maxBy(Comparator.comparing(Dish::getCalories)), 
						 Optional::get)));
		 
		 
		 var result59 = Dish.menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
		 
		 var result60 = Dish.menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.counting()));
		 var result61 = Dish.menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.maxBy(Comparator.comparing(Dish::getCalories))));
		 
		 
		 var result62 = Dish.menu.stream()
				 .collect(Collectors.partitioningBy(Dish::isVegetarian, 
						 Collectors.collectingAndThen(
								 Collectors.maxBy(Comparator.comparing(Dish::getCalories)),
								 Optional::get)));
		 
		 System.out.println(result55);
		 System.out.println(result56);
		 System.out.println(result57);
		 System.out.println(result58);
		 
		 System.out.println(result59);
		 System.out.println(result60);
		 System.out.println(result61);
		 System.out.println(result62);
		 
		 
		 

	}

}
