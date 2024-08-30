package optional.test.insurance.optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Insurance i = new Insurance("SURA");
		Car c = new Car("UML-132");
		c.setInsurance(Optional.of(i));
		Person p = new Person();
		p.setCar(Optional.of(c));

		Optional<Person> person = Optional.of(p);

		String insuranceNamce = person
				.flatMap(Person::getCar)
				.flatMap(Car::getInsurance)
				.map(Insurance::getName)
				.orElse("Unknow");

		System.out.println(insuranceNamce);

	}

	public static Optional<Insurance> findCheapestInsurance(Optional<Person> p, Optional<Car> c) {
		return p.flatMap(person -> c.flatMap(car -> findInsuranceCheapest(person, car)));
	}

	public static Optional<Insurance> findInsuranceCheapest(Person p, Car c) {
		return Optional.empty();
	}

	public static String getInsuranceName(Optional<Person> person) {
		return person.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("Unknow");
	}

	public static String getInsuranceNameByMinAge(Optional<Person> person, int minAge) {
		return person.filter(p -> p.getAge() >= minAge).flatMap(Person::getCar).flatMap(Car::getInsurance)
				.map(Insurance::getName).orElse("UnKnow");
	}

}
