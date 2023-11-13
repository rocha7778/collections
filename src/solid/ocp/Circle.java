package solid.ocp;

public class Circle  implements Shape{
	private final double radio;
	
	public Circle(double radio) {
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI * (Math.pow(radio, 2));
	}

}
