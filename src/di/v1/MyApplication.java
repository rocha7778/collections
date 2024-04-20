package di.v1;

import di.EmailService;

public class MyApplication {

	private EmailService email = null;

	public MyApplication(EmailService email) {
		this.email = email;
	}

	public void processMessages(String msg, String rec) {
		this.email.sendEmail(msg, rec);
	}

}
