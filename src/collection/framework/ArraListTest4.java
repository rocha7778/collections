package collection.framework;

import java.util.List;

public class ArraListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main class: " + Thread.currentThread());

		List.of(1, 2, 3)
		.stream()
		.parallel()
		.map(number -> transform(number))
		.sequential()
		.forEach(number -> print(number));

	}

	// Where will transform run?
	public static int transform(int number) {
		System.out.println("transform: " + Thread.currentThread());
		return number * 2;
	}

	public static void print(int number) {
		System.out.println("print: " + Thread.currentThread() + "Number: " + number);
	}

}
