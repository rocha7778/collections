package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroubyJava7vsJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		boolean trueOfalse = false;
		
		System.out.println("Numero "+ numero + " boolean "+trueOfalse);
		
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
		
		Map<String, List<Employee>> employeeByTitle = groupByJobTitle(employees);
		
		System.out.print(employeeByTitle);
		
		

	}

	public static Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
		Map<String, List<Employee>> resultMap = new HashMap<>();

		for (int i = 0; i < employeeList.size(); i++) {
			Employee employee = employeeList.get(i);
			List<Employee> employeeSubList = resultMap.getOrDefault(employee.getTitle(), new ArrayList<Employee>());
			employeeSubList.add(employee);
			resultMap.put(employee.getTitle(), employeeSubList);
		}
		
		return resultMap;
	}

	public static Map<String, List<Employee>> groupByJobTitleJ8(List<Employee> employeeList) {

		return employeeList.stream().collect(Collectors.groupingBy(Employee::getTitle));

	}
	
	public static Double calculateAvarageSalary(List<Employee> employeeList) {

		return employeeList.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();

	}
	
	

}
