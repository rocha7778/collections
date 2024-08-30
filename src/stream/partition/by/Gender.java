package stream.partition.by;

public enum Gender {

	MAN("HOMBRE"), 
	WOMAN("MUJER"), 
	BOY("NIÑO"), 
	GIRL("NIÑA"), 
	BABY("BEBÉS"), 
	UNISEX("UNISEX"),
	MULTIPLE_GENDER("MULTIPLE GENDER"), 
	UNDEFINED("UNDEFINED");

	private final String value;

	private Gender(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	

}
