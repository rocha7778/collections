package chap2.test;

import java.util.Arrays;
import java.util.List;

import domain.chap2.Apple;

public class FarmInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
//
//		// [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
		List<Apple> greenApples = AppleFilter.filterApples(inventory, AppleFilter::isGreenApple);
		System.out.println(greenApples);
//		
//		// [Apple{color='green', weight=155}]
//        List<Apple> heavyApples = AppleFilter.filterApples(inventory, AppleFilter::isHeavyApple);
//        //System.out.println(heavyApples);
//        
//        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
//        List<Apple> greenApples2 = AppleFilter.filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
//        //System.out.println(greenApples2);
//        
//        // [Apple{color='green', weight=155}]
//        List<Apple> heavyApples2 = AppleFilter.filterApples(inventory, (Apple a) -> a.getWeight() > 150);
//        //System.out.println(heavyApples2);
//        
//        // []
//        List<Apple> weirdApples = AppleFilter.filterApples(inventory, (Apple a) -> a.getWeight() < 80 || 
//                                                                       "brown".equals(a.getColor()));
//        //dSystem.out.println(weirdApples);

	}

}
