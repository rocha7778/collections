package di.v2.injector;

import di.v2.SMSServiceImpl;
import di.v2.consumer.Consumer;
import di.v2.consumer.MyDIApplication;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
