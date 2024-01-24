package lambdasinaction.chap4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import lambdasinaction.chap4.TreeSeetTest.Employee;

public class AvarageByTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] employeesArr = { new Employee("John", 34, "developer", 80000f),
				new Employee("Hannah", 24, "developer", 95000f), new Employee("Bart", 50, "sales executive", 100000f),
				new Employee("Sophie", 49, "construction worker", 40000f), new Employee("Darren", 38, "writer", 50000f),
				new Employee("Nancy", 29, "developer", 75000f),
				new Employee("Rocha", 49, "construction worker", 35780f),
				new Employee("Homero", 50, "sales executive", 150000f) };
		List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

		Set<Entry<String, List<Employee>>> employeByJobTitle = employees.stream()
				.collect(Collectors.groupingBy(e -> e.jobTitle)).entrySet();

		System.out.println(employeByJobTitle);

		Map<String, Float> resultEntry = employeByJobTitle.stream().collect(
				Collectors.toMap(
				  Entry::getKey,
				  AvarageByTitle::calculateAverageSalary));

		System.out.println(resultEntry);
		
		Map<String, Float> resultEntry2 = employeByJobTitle.stream().collect(Collectors.toMap(entry -> entry.getKey(),

				entry -> entry.getValue().stream().map(e -> e.salary).reduce(0f, (s1, s2) -> s1 + s2)
						/ entry.getValue().size()));

	}

    private static Float calculateAverageSalary(Entry<String, List<Employee>> entry) {
        return entry.getValue().stream()
                .map(e -> e.salary)
                .reduce(0f, Float::sum) / entry.getValue().size();
    }

}
