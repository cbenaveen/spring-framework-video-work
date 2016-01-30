package com.mail.sender;

import com.mail.sender.provider.EMailServiceProvider;
import com.mail.sender.provider.EmailSender;

public class App {
	public static void main(String[] args) {
		//factory which creates email sender based on email id
		EmailSender emailSender = EmailSender.getInstance();
		
		EMailServiceProvider gmailProvider = emailSender.getProvider("abcd@gmail.com");
		EMailServiceProvider yahooProvider = emailSender.getProvider("my-yahoo@yahoo.com");
		EMailServiceProvider hotmailProvider = emailSender.getProvider("your-hotmail@hotmail.com");
		
		gmailProvider.sendMail("abcd@gmail.com", "HI! this a test mail from gmail provider", null);
		yahooProvider.sendMail("my-yahoo@yahoo.com", "HI! this a test mail from yahoo provider", null);
		hotmailProvider.sendMail("your-hotmail@hotmail.com", "HI! this a test mail from hotmail provider", null);
	}
}
