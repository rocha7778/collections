package stream.java17.prueba.paquete;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import stream.java17.Person;
import stream.java17.Person.Gender;

public class PruebaPaquete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		
		Map<Long, String> hola = p.persons().stream().collect(Collectors.toMap(Person::getId, Person::getName));
		
		System.out.println(hola);
		
		
		
		System.out.println("Collector by Gender using Collectors.groupingBy");
		
		Map<Gender, List<String>> person = p.persons().stream().collect(Collectors.groupingBy(Person::getGender, Collectors.mapping(Person::getName, Collectors.toList())));
		
		System.out.println(person);
		
		
		System.out.println("Collector by Gender using Collectors.toMap");
		
		
		Map<Gender, String> gender =  p.persons().stream().collect(Collectors.toMap(Person::getGender, Person::getName));
		
		System.out.print(gender);
		
		
		
	
		
		
		

	}

}
