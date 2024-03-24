package optional.test.insurance.optional;

import java.util.Optional;

public class Car {
	
	private Optional<Insurance> insurance;
	private String matricula;
	
	
	

	public Car(String matricula) {
		super();
		this.matricula = matricula;
	}

	public Car() {
		super();
	}

	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}

	public String getMatricula() {
		return matricula;
	}


}
