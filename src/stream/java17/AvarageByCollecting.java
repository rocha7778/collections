package stream.java17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class AvarageByCollecting {
	
	static class Employee {
		public final String name;
		public final Integer age;
		public final String jobTitle;
		public final Float salary;

		public Employee(String name, Integer age, String jobTitle, Float salary) {
			this.name = name;
			this.age = age;
			this.jobTitle = jobTitle;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return name + " " + salary;
		}

	

	}
	

	public static void main(String[] args) {

		
		Employee[] employeesArr = { 
				new Employee("John", 34, "developer", 80000f),
				new Employee("Hannah", 24, "developer", 95000f), new Employee("Bart", 50, "sales executive", 100000f),
				new Employee("Sophie", 49, "construction worker", 40000f), new Employee("Darren", 38, "writer", 50000f),
				new Employee("Nancy", 29, "developer", 75000f),
				new Employee("Rocha", 49, "construction worker", 35780f),
				new Employee("Homero", 50, "sales executive", 150000f) };
		
		List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));
		
		var avarageByTitle = employees.stream().collect(Collectors.groupingBy(e -> e.jobTitle, Collectors.averagingDouble(e -> e.salary.doubleValue())));
		
		
		System.out.println(avarageByTitle);
		
		
		
	}

}
