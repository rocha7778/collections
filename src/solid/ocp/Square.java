package solid.ocp;

public class Square implements Shape {
	
	private final Double side;
	
	public Square(Double side) {
		this.side = side;
	}


	@Override
	public double getArea() {
		return Math.pow(side, side);
	}

}
