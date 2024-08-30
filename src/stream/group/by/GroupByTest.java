package stream.group.by;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import lambdasinaction.chap4.Dish;
import lambdasinaction.chap4.Dish.CaloricLevel;
import lambdasinaction.chap4.Dish.Type;
import stream.v1.Transaction;
import stream.v1.TransactionData;

public class GroupByTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer> lengthString  = s -> s.length();
		
		
		var transactions =  TransactionData.transactions();
		
		var result = transactions.stream().collect(Collectors.groupingBy(Transaction::getYear));
		
		System.out.println(result);
		
		Map<Dish.Type, List<Dish>> dishesByType = Dish
				.menu
				.stream()
				.collect(Collectors.groupingBy(Dish::getType));
		
		Map<Dish.CaloricLevel,List<Dish>> dishByCaloricLevel = 
				Dish
				.menu
				.stream()
				.collect(Collectors.groupingBy(Dish::getCaloricLevl));
		
		Map<Type, Long> dishesByType2 = Dish
				.menu
				.stream()
				.collect(Collectors.groupingBy(Dish::getType, 
						Collectors.counting()));
		
		System.out.println("groupping by" + dishesByType2);
		
		Map<Type, Dish> mostCaloricByType = Dish
				.menu
				.stream()
				.collect(Collectors.groupingBy(Dish::getType, 
								Collectors.collectingAndThen(
										Collectors.maxBy(
										Comparator.comparingInt(Dish::getCalories))
										, Optional::get)
								));
		
		System.out.println("Most caloric dish by type" + mostCaloricByType);
		
		
		Map<Dish.Type, Set<CaloricLevel>> caloricLevelByType = 
				Dish
				.menu
				.stream()
				.collect(Collectors.groupingBy(Dish::getType, 
						Collectors.mapping(Dish::getCaloricLevl, 
								Collectors.toSet())));
		
		System.out.println("CaloricLevelByType " + caloricLevelByType);

	}

}
