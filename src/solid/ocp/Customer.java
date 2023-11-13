package solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		Circle c = new Circle(12.5D);
		Square s = new Square(3.2D);
		Triangle t = new Triangle(10D, 3D);
		
		shapes.add(c);
		shapes.add(s);
		shapes.add(t);
		
		System.out.println(Customer.calculateTotalArea(shapes));

	}
	
	
	public static Double calculateTotalArea(List<Shape> shapes) {
		
		Double  area = 0.0;
		area = shapes.stream().map(s -> s.getArea()).reduce(0.0, (a, b) -> a+b);
		return area;
	}

}
