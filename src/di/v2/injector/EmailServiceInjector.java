package di.v2.injector;

import di.v2.EmailServiceImpl;
import di.v2.consumer.Consumer;
import di.v2.consumer.MyDIApplication;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}
