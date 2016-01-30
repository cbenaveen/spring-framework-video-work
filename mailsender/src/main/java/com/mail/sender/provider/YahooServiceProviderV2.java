package com.mail.sender.provider;

import java.util.Map;

public class YahooServiceProviderV2 implements EMailServiceProvider {

	public boolean sendMail(String emailId, String message,
			Map<String, String> options) {
		System.out.println("[Yahoo ProviderV2] Sending mail to ID:" + emailId +". The Message is " + message);
		return true;
	}

}
