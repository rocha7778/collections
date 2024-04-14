package collection.framework;

public class ContactInfoDTO {
	
    private String usageType;
    private String startDt;
    private String preferredIndicator;
    private String sourceIdentifierType;
    private String contactValue;
    private String contactType;
    private PhoneNum phoneNum;
    
    
    
    
	@Override
	public String toString() {
		return "ContactInfoDTO [usageType=" + usageType + ", startDt=" + startDt + ", preferredIndicator="
				+ preferredIndicator + ", sourceIdentifierType=" + sourceIdentifierType + ", contactValue="
				+ contactValue + ", contactType=" + contactType + ", phoneNum=" + phoneNum + "]";
	}


	public ContactInfoDTO(String usageType, String startDt, String preferredIndicator, String sourceIdentifierType,
			String contactValue, String contactType, PhoneNum phoneNum) {
		super();
		this.usageType = usageType;
		this.startDt = startDt;
		this.preferredIndicator = preferredIndicator;
		this.sourceIdentifierType = sourceIdentifierType;
		this.contactValue = contactValue;
		this.contactType = contactType;
		this.phoneNum = phoneNum;
	}


	public ContactInfoDTO() {
		super();
	}


	public String getUsageType() {
		return usageType;
	}


	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}


	public String getStartDt() {
		return startDt;
	}


	public void setStartDt(String startDt) {
		this.startDt = startDt;
	}


	public String getPreferredIndicator() {
		return preferredIndicator;
	}


	public void setPreferredIndicator(String preferredIndicator) {
		this.preferredIndicator = preferredIndicator;
	}


	public String getSourceIdentifierType() {
		return sourceIdentifierType;
	}


	public void setSourceIdentifierType(String sourceIdentifierType) {
		this.sourceIdentifierType = sourceIdentifierType;
	}


	public String getContactValue() {
		return contactValue;
	}


	public void setContactValue(String contactValue) {
		this.contactValue = contactValue;
	}


	public String getContactType() {
		return contactType;
	}


	public void setContactType(String contactType) {
		this.contactType = contactType;
	}


	public PhoneNum getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(PhoneNum phoneNum) {
		this.phoneNum = phoneNum;
	}
	
    

}
