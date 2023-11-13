package collection.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import domain.chap2.Employee;

public class ArrayListVsTreeSetTestOrdering2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Employee e1 = new Employee(1L, "Rocha");
		Employee e2 = new Employee(2L, "Patricia");
		Employee e3 = new Employee(3L, "Carlos");
		Employee e4 = new Employee(4L, "Moises");
		Employee e5 = new Employee(5L, "Zuluaga");

	

		List<Employee> listObject = new ArrayList<>();

		listObject.add(e5);
		listObject.add(e4);
		listObject.add(e3);
		listObject.add(e2);
		listObject.add(e1);
		listObject.add(e5);

		Set<Employee> setObject = new TreeSet<>();

		setObject.add(e5);
		setObject.add(e4);
		setObject.add(e3);
		setObject.add(e2);
		setObject.add(e1);
		setObject.add(e5);
		
		
		printCollections(listObject);
		printCollections(setObject);
		
		System.out.println("Size of list " +listObject.size());
		System.out.println("Size of set " +setObject.size());

	}

	public static void printCollections(Collection c) {

		System.out.println(c);
	}

}
