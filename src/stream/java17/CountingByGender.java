package stream.java17;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountingByGender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Boolean, Long> result = Person.persons().stream()
				.collect(Collectors.groupingBy(Person::isFemale, Collectors.counting()));
		
		System.out.println(result);
		
		
		System.out.println("----------------------");
		
		Map<Boolean, List<Person>> peopeByGender = Person.persons().stream().collect(Collectors.groupingBy(Person::isFemale));
		
		System.out.println(peopeByGender);
		
        System.out.println("----------------------");
		
		Map<Boolean, Optional<Person>> peopeByGenderByMaxIncome = 
				Person
				.persons()
				.stream()
				.collect(Collectors.groupingBy(Person::isFemale, 
						Collectors.maxBy(
								Comparator.comparing(Person::getIncome))));
		
		System.out.println(peopeByGenderByMaxIncome);
		
		
		System.out.println("----------------------");
		
		
		Map<Boolean, Object> peopleByGenderByMaxIncome2 =
                Person.persons()
                        .stream()
                        .collect(Collectors.groupingBy(Person::isFemale,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(Person::getIncome)),
                                        Optional::get
                                )));

        System.out.println(peopleByGenderByMaxIncome2);
		
		
	}

}
