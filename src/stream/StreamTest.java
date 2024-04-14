package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList(Arrays.asList("one", "two"));
		Stream<String> sl = l.stream();
		l.add("three");
		String s = sl.collect(Collectors.joining(" "));

		System.out.println(s);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 5, 3, 8, 20);

		list.stream().mapToInt(Integer::valueOf).distinct().forEach(System.out::println);

		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

		colors.stream().collect(Collectors.toMap(key -> key, String::length))
				.forEach((keyMap, value) -> System.out.println(keyMap + " : " + value));

		colors.stream().filter(str -> str.startsWith("B")).toList().forEach(System.out::println);

		var resultMax = list.stream().mapToInt(Integer::valueOf).max().getAsInt();
		var resultMin = list.stream().mapToInt(Integer::valueOf).min().getAsInt();
		
		System.out.println(resultMax);
		System.out.println(resultMin);

		record MaxMinNumber(int max, int min) {
		}
		var resultRecord = list.stream().collect(Collectors.teeing(
				Collectors.minBy(Integer::min),
				Collectors.maxBy(Integer::max), 
				(min, max) -> new MaxMinNumber(min.get(), max.get())));

		System.out.println(resultRecord);

		List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);

		System.out.println(nums);
		
		var secondSmaller = nums.stream().sorted().skip(1).findFirst().get();
		
		var secondMax = nums.stream().sorted((n1, n2) ->n2.compareTo(n1)).skip(1).findFirst().get();
		
		System.out.println(secondSmaller);
		System.out.println(secondMax);

	}

}
