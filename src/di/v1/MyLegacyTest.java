package di.v1;

import di.EmailService;

public class MyLegacyTest {
	
	private static EmailService emailService = new EmailService();
	
	public static void main(String[] args) {
		MyApplication app = new MyApplication(emailService);
		app.processMessages("Hi Pankaj", "pankaj@abc.com");
	}

}
