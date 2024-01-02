package records.test;

public record CustomerRecord(String name, int age) {
	
	public CustomerRecord{
		if(age<=0) {
			throw new RuntimeException("Age should be greater than zero");
		}
		
		if(name.isBlank()) {
			throw new RuntimeException("Name field should not be empty");
		}
	}
}
