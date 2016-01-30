package com.mail.sender.provider;

import java.util.Map;

class GmailServiceProvider implements EMailServiceProvider {
	public boolean sendMail(String emailId, String message,
			Map<String, String> options) {
		System.out.println("[GMail Provider] Sending mail to ID:" + emailId +". The Message is " + message);
		return true;
	}
}
