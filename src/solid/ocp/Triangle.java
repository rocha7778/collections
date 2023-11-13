package solid.ocp;

public class Triangle  implements Shape{
	
	private final Double base;
	private final Double height;
	
	public Triangle(Double base, Double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (base*height)/2;
	}

}
