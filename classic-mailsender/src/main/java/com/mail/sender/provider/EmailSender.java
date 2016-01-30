package com.mail.sender.provider;


public class EmailSender {

	private static final EmailSender INSTANCE = new EmailSender();

	private EmailSender() {
	}

	public static EmailSender getInstance() {
		return INSTANCE;
	}
	
	public EMailServiceProvider getProvider(String emailId){
		if(emailId.endsWith("@gmail.com")){
			return new GmailServiceProviderV2();
		} else if(emailId.endsWith("@yahoo.com")){
			return new YahooServiceProviderV2();
		} else if(emailId.endsWith("@hotmail.com")){
			return new HotmailServiceProviderV2();
		}
		
		throw new RuntimeException("Unable to find email service provider");
	}
}
 