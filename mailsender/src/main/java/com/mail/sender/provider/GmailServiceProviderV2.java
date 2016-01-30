package com.mail.sender.provider;

import java.util.Map;

public class GmailServiceProviderV2 implements EMailServiceProvider {

	public boolean sendMail(String emailId, String message,
			Map<String, String> options) {
		System.out.println("[GMail ProviderV2] Sending mail to ID:" + emailId +". The Message is " + message);
		return true;
	}

}
