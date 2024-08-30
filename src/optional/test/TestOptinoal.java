package optional.test;

import java.util.Optional;

public class TestOptinoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var result =  Optional.ofNullable("hola")
		        .map(a -> testNullOptinoal(a));
		
		System.out.println(result);
	}

	private static String testNullOptinoal(String itemId) {
		// TODO Auto-generated method stub
		return (itemId);
	}

}
