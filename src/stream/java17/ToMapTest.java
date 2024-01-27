package stream.java17;

import java.util.Map;
import java.util.stream.Collectors;

public class ToMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Long, String> result = Person.persons().stream().collect(Collectors.toMap(
				p->p.getId(),
				p-> p.getName(),
				(existingValue, newValue) -> existingValue));
		
		System.out.println(result);
		
		


	}

}
