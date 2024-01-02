package inheritance.test;

public class Derived extends Base{
	
	private String value;

	public Derived(String value) {
		this.value = value;
	}
	
	public void check() {
		if(value.length() == 0) {
			throw new RuntimeException("Empty value given");
		}
	}

}
