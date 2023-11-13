package lambdasinaction.chap4;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StreamBasic {

	enum CaloricLevel {
		DIET, NORMAL, FAT
	};

	public static void main(String... args) {

		// Java 7
		getLowCaloricDishesNamesInJava7(Dish.menu).forEach(System.out::println);

		System.out.println("---");

		// Java 8
		getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);

		Map<CaloricLevel, List<Dish>> dishesByCaloricLevel =
				Dish.menu.stream().collect(groupingBy(dish -> {
					if (dish.getCalories() <= 40)
						return CaloricLevel.DIET;
					else if (dish.getCalories() <= 70)
						return CaloricLevel.NORMAL;
					else
						return CaloricLevel.FAT;
				})
				);
		
		Map<Dish.CaloricLevel, List<Dish>> dishesByCaloricLevel2 = 
				 Dish.menu.stream().collect(groupingBy(Dish::getCaloricLevl));

	}

	public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
		List<Dish> lowCaloricDishes = new ArrayList<>();
		for (Dish d : dishes) {
			if (d.getCalories() < 400) {
				lowCaloricDishes.add(d);
			}
		}
		List<String> lowCaloricDishesName = new ArrayList<>();
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
			public int compare(Dish d1, Dish d2) {
				return Integer.compare(d1.getCalories(), d2.getCalories());
			}
		});
		for (Dish d : lowCaloricDishes) {
			lowCaloricDishesName.add(d.getName());
		}
		return lowCaloricDishesName;
	}

	public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
		return dishes.stream().filter(d -> d.getCalories() < 400).sorted(comparing(Dish::getCalories))
				.map(Dish::getName).collect(toList());
	}

}
