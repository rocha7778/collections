package optional.test.insurance.optional;

import java.util.Optional;

public class Person {
	private Optional<Car> car;
	private int age;
	
	

	public Person() {
		super();
	}

	public Optional<Car> getCar() {
		return car;
	}

	public void setCar(Optional<Car> car) {
		this.car = car;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
