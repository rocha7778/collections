package optional.test.properties;

import java.util.Optional;

public class NumberUtility {

	public static Optional<Integer> stringToint(String value) {

		try {
			return Optional.ofNullable(Integer.parseInt(value));
		} catch (Exception e) {

			return Optional.empty();
		}

	}

}
