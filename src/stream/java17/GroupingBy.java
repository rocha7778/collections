package stream.java17;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import stream.java17.Person.Gender;

public class GroupingBy {

	public static void main(String[] args) {

		Map<Gender, Optional<Person>> result = Person.persons()
				.stream().collect(Collectors.groupingBy(
						Person::getGender,
				        Collectors.mapping(
				        		Function.identity(), 
				        		Collectors.maxBy(Comparator.comparingDouble(Person::getIncome))
				        		)
				        ));
		
		
		
		
		Map<Gender, Person> result2 = Person.persons()
				
				.stream()
				.collect(Collectors.groupingBy(
						Person::getGender,
				        Collectors.collectingAndThen(
				        		Collectors.maxBy(Comparator.comparingDouble(Person::getIncome)),
				        		Optional::get
				        		)
				        ));
		
	Map<Gender, Long> toralPersonByGender=	Person.persons()
			.stream()
			.collect(Collectors.groupingBy(Person::getGender, Collectors.counting()));
	
	
	 var avarageSalaryByGender = Person.persons().stream().collect(Collectors.groupingBy(Person::getGender, Collectors.averagingDouble(Person::getIncome)));
		

		 

		System.out.println(result);
		System.out.println(result2);
		System.out.println(toralPersonByGender);
		System.out.println(avarageSalaryByGender);

	}

}
