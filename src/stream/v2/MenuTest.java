package stream.v2;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import lambdasinaction.chap4.Dish;
import lambdasinaction.chap4.Dish.CaloricLevel;
import lambdasinaction.chap4.Dish.Type;

public class MenuTest {

	public static void main(String[] args) {

		var higestCalories = Comparator.comparingInt(Dish::getCalories);

		Map<Type, Object> result = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType,
				Collectors.collectingAndThen(Collectors.maxBy(higestCalories), Optional::get)));

		System.out.println(result);

		Map<Dish.Type, Integer> toalCaloriesByTpe = Dish.menu.stream()
				.collect(Collectors.groupingBy(Dish::getType, Collectors.summingInt(Dish::getCalories)));

		System.out.println(toalCaloriesByTpe);

		Map<Type, Set<CaloricLevel>> result2 = Dish.menu.stream().collect(
				Collectors.groupingBy(Dish::getType, Collectors.mapping(Dish::getCaloricLevl, Collectors.toSet())));

		System.out.println(result2);

	}

}
