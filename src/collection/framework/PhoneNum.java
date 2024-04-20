package collection.framework;

public class PhoneNum {

	private String countryCode;
	private String phone;
	private String phoneExtension;
	
	

	public PhoneNum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneNum(String countryCode, String phone, String phoneExtension) {
		super();
		this.countryCode = countryCode;
		this.phone = phone;
		this.phoneExtension = phoneExtension;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getPhoneExtension() {
		return this.phoneExtension;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPhoneExtension(String phoneExtension) {
		this.phoneExtension = phoneExtension;
	}

}
