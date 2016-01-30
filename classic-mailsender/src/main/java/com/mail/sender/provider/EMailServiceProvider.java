package com.mail.sender.provider;

import java.util.Map;

public interface EMailServiceProvider {
	boolean sendMail(String emailId, String message, Map<String, String> options);
}
