package stream.v2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import lambdasinaction.chap4.Dish;
import lambdasinaction.chap4.Dish.Type;

public class PartitioninByExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Map<Boolean, List<Dish>> disehsByVegeterian = Dish.menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(disehsByVegeterian);

        Map<Boolean, Map<Type, List<Dish>>> hola = Dish.menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.groupingBy(Dish::getType)));

        System.out.println(hola);

        Map<Boolean, Dish> mostCaloricParttitionByVegetarian = Dish.menu.stream().collect(
                Collectors.partitioningBy(Dish::isVegetarian,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)),
                                Optional::get)));

                                System.out.println(mostCaloricParttitionByVegetarian);

    }
}
