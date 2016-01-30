package com.mail.sender.provider;

import java.util.Map;

public class HotmailServiceProvider implements EMailServiceProvider {
	public boolean sendMail(String emailId, String message,
			Map<String, String> options) {
		System.out.println("[Hotmail Provider] Sending mail to ID:" + emailId +". The Message is " + message);
		return true;
	}
}
