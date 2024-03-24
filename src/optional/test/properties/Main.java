package optional.test.properties;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberUtility.stringToint("a");
		
		var result = readDuration(new Properties().builder().setProperties("a", "-1").setProperties("b", "3").setProperties("d", "-3").build(), "d");
		
		System.out.println(result);

	}
	
	
	public static int readDuration(Properties properties, String key) {
		
		return Optional.ofNullable(properties.getProperty(key))
		.flatMap(NumberUtility::stringToint)
		.filter(n -> n>0)
		.orElse(0);
		
	}

}
