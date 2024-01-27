package stream.v1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import lambdasinaction.chap4.Dish;
import lambdasinaction.chap4.Dish.CaloricLevel;
import lambdasinaction.chap4.Dish.Type;

public class TestStreamTransactionOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), 
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), 
				new Transaction(mario, 2012, 700), 
				new Transaction(alan, 2012, 950));
		
		
		Map<Integer, List<Transaction>> result = transactions.stream().collect(Collectors.groupingBy(Transaction::getYear));
		
		// how many dishes in the menu?
		
		Dish.menu.stream().count();
		
		Comparator<Dish> caloricCompartor = Comparator.comparingInt(Dish::getCalories);
		
		Optional<Dish> resultDish = Dish.menu.stream().collect(Collectors.maxBy(caloricCompartor));
		
		System.out.println("The most caloric dish: " +resultDish.orElseThrow());
		
		int totalCalorias = Dish.menu.stream().collect(Collectors.summingInt(Dish::getCalories));
		
		System.out.println("Total calories: " +totalCalorias);
		
		//var result = list.stream().reduce(0,(a,b)-> a+b);
		
		int totalCalorias2 = Dish.menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (a,b)-> a+b));
		int totalCalorias4 = Dish.menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
		Optional<Dish> totalCalorias3 = Dish.menu.stream().collect(Collectors.reducing((d1,d2) -> d1.getCalories()> d2.getCalories()?d1 : d2));
		Integer totalCalorias5 = Dish.menu.stream().map(Dish::getCalories).reduce(0,Integer::sum);
		Integer totalCalorias6 = Dish.menu.stream().mapToInt(Dish::getCalories).sum();
		
		
		Map<Type, List<Dish>> dishByType = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType));
		Map<CaloricLevel, List<Dish>> dishByCarolicLevel = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getCaloricLevl));
		
		System.out.println(dishByType);
		System.out.println(dishByCarolicLevel);
		
		
		Map<Type, Map<CaloricLevel, List<Dish>>> dishByCaloricLevelAndType = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.groupingBy(Dish::getCaloricLevl)));
		
		Map<Type, Long> dishCountBytype = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
		
		System.out.println(dishCountBytype);
		
		
		Map<Type, Dish> mostCaloricLevelByType =
				Dish.menu.stream()
				.collect(
						Collectors.groupingBy(
								Dish::getType, 
								Collectors.collectingAndThen(
										Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), 
										Optional::get)
								));
		
		
		System.out.println(mostCaloricLevelByType);
		
		//Map<Type, CaloricLevel>
		
	Map<Type, Set<CaloricLevel>> hola = 	Dish.menu.stream()
		.collect(
				Collectors.groupingBy(
						Dish::getType,
						Collectors.mapping(Dish::getCaloricLevl, Collectors.toSet())
						));
		
		

	System.out.println("Hola result from mapping");
	System.out.println(hola);
	
	
		
		
		
		
		
		
		
		

	}

}
