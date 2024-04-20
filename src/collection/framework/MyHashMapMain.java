package collection.framework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class MyHashMapMain {

	public static void main(String[] args) {
		
		MyHasMap hasMap = new MyHasMap();
		hasMap.put("1", 1);
		hasMap.get("1");
		
		System.out.println(generateDateStartDt());
		
		System.out.println("Verification" + verifyNumberPhoneApplyTimeRule(buildContactInfoListPassTest(),"3152475896"));
	}
	
	
	  public static String generateDateStartDt(){

		    Calendar calendar= Calendar.getInstance();
		    calendar.add(Calendar.DATE, -30);
		    Date nowMinus15days = calendar.getTime();
		    SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		    String stringDate = DateFor.format(nowMinus15days);
		    return stringDate;
		  }
	  
	  public static List <ContactInfoDTO> buildContactInfoListPassTest() {
		    ContactInfoDTO contact= new ContactInfoDTO();
		    contact.setContactType("1100000");
		    contact.setContactValue("3152475896");
		    /*PhoneNum phone = new PhoneNum();
		    phone.setPhone("3152475896");
		    phone.setCountryCode("1");
		    contact.setPhoneNum(phone);
		    */
		    contact.setStartDt("2022-03-10 00:00:00.0");

		    List <ContactInfoDTO> contactList =new ArrayList<>();
		    contactList.add(contact);
		    return contactList;

		  }
	  
	  
	  public static ContactInfoDTO verifyNumberPhoneApplyTimeRule(List<ContactInfoDTO> contactsInfo, String phoneNumberFront){
		  if(contactsInfo != null && phoneNumberFront !=null) {
		    Optional<ContactInfoDTO> contactInfo = contactsInfo.stream()
		       .filter(Objects::nonNull)
		      .filter(phone-> Objects.nonNull(phone.getPhoneNum()))		
		      .filter(phone -> Objects.nonNull(phone.getPhoneNum().getPhone()))
		      .filter(num -> num.getPhoneNum().getPhone().equals(phoneNumberFront))
		      .findFirst();
		    
		    ContactInfoDTO contactInfo2 = new ContactInfoDTO();
		    contactInfo2.setContactValue("rocha");
		    
		    return contactInfo.orElse(contactInfo2);
		  }
		  
		  ContactInfoDTO contactInfo2 = new ContactInfoDTO();
		  
		  return contactInfo2;
		  
	  }
	  
	  private static Boolean isPhoneObjectValid(ContactInfoDTO phone) {
		  return Objects.nonNull(phone) &&
				 Objects.nonNull(phone.getPhoneNum()) && 
				 Objects.nonNull(phone.getPhoneNum().getPhone());
	  }

}
