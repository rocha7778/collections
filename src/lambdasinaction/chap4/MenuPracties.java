package lambdasinaction.chap4;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import lambdasinaction.chap4.Dish.Type;

public class MenuPracties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Object> print = System.out::println;
		Map<Type, Long> result = Dish.menu.stream()
				.collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));

		System.out.println(result);

		Map<Type, Object> tipoDeMenuMasCalorias = Dish.menu.stream()
				.collect(Collectors.groupingBy(Dish::getType, Collectors
						.collectingAndThen(
								Collectors.maxBy(Comparator.comparing(Dish::getCalories)),
								Optional::get)));

		System.out.println("TipoMenuMasCaolorias" + tipoDeMenuMasCalorias);
		
		
		Map<Type, Integer> totalCaloriesByTypeDish = 
				Dish.menu.stream().collect(
						Collectors.groupingBy(Dish::getType,
								Collectors.summingInt(Dish::getCalories)));
		
		System.out.println("Total Calorias por tipo de plato" +totalCaloriesByTypeDish);
		
		
		var caloricLevelyTypeDish = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(Dish::getCaloricLevl, Collectors.toSet())));
		
		System.out.println("Caloric level by Dish type" + caloricLevelyTypeDish);
		
		Map<Boolean, Long> numberDishByVegeterianAndNo = Dish.menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.counting()));
		
		System.out.println("numberDishByVegeterianAndNo" + numberDishByVegeterianAndNo);
		
	}

}
