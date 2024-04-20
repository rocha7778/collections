package collection.framework.collectors.team;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import lambdasinaction.chap4.Dish;
import lambdasinaction.chap4.Dish.Type;

public class CollectorsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Dish> list = Dish.menu.stream().collect(new CollectorsInterfaceTest<>());
		List<Dish> list2 = Dish.menu.stream().collect(ArrayList::new, List::add, List::addAll);
		
		Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType)).forEach((k,l) ->System.out.println("Type: "+k+" - "+l));
		
		System.out.println("");
		System.out.println("");
		System.out.println("The most calorics disheses");
		
		Dish.menu.stream().collect(
				Collectors.groupingBy(
						Dish::getType,  
						Collectors.collectingAndThen(
								Collectors.maxBy(
								Comparator.comparing(Dish::getCalories)),
								Optional::get)   
						))
		.forEach((k,l) ->System.out.println("Type: "+k+" - "+l));
		
		System.out.println("");
		System.out.println("The quantity  disheses per Type");
		Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting())).forEach((k,l) ->System.out.println("Type: "+k+" - "+l));
		
		
		
		Map<Type, Set<Dish>> hola = Dish.menu.stream().collect(
				Collectors.groupingBy(
						Dish::getType,  
						Collectors.filtering(d -> d.getCalories()>150, Collectors.toSet())));
		
		System.out.println("Hola filtering using collectors");
		
		System.out.println(hola);
		
		
		
		 Map<Type, Set<Dish>> hola2 = Dish.menu.stream().filter(e-> e.getCalories()>1800).collect(
				Collectors.groupingBy(
						Dish::getType  
						, Collectors.toSet()));
		
		System.out.println("Hola filtering using stream");
		
		System.out.println(hola2);
		
		
	}

}
