package di.v2.client;

import di.v2.consumer.Consumer;
import di.v2.injector.EmailServiceInjector;
import di.v2.injector.MessageServiceInjector;
import di.v2.injector.SMSServiceInjector;

public class MyMessageDITest {
	
	public static void main(String[] args) {
		String msg = "Hi Pankaj";
		String email = "pankaj@abc.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
