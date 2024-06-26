package stream.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import stream.Employee;

public class GroupByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<>();

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();

		e1.setTitle("Java Developer");
		e1.setId(1);
		e1.setSalary(1500.0);
		e2.setTitle("Java Developer");
		e2.setId(2);
		e2.setSalary(3500.0);
		e3.setTitle("Groovy");
		e3.setId(3);
		e3.setSalary(1850.0);
		e4.setTitle("Groovy");
		e4.setId(4);
		e4.setSalary(4500.0);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		Map<String, List<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::getTitle));
		
		System.out.println(result);
		
		Map<String, Double> avarageByTitle =employees.stream().collect(Collectors.groupingBy(Employee::getTitle, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avarageByTitle);
		

		

	}

}
