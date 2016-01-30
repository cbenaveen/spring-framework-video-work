package com.mail.sender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mail.sender.provider.EMailServiceProvider;
import com.mail.sender.provider.HotmailServiceProvider;
import com.mail.sender.provider.HotmailServiceProviderV2;
import com.mail.sender.provider.YahooServiceProvider;
import com.mail.sender.provider.YahooServiceProviderV2;

public class App {
	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EMailServiceProvider gmailProvider = (EMailServiceProvider) context.getBean("gmailProvider"); 
		EMailServiceProvider yahooProvider = context.getBean("yahooProvider", YahooServiceProviderV2.class);
		EMailServiceProvider hotmailProvider = context.getBean(HotmailServiceProviderV2.class);
		
		gmailProvider.sendMail("abcd@gmail.com", "HI! this a test mail from gmail provider", null);
		yahooProvider.sendMail("my-yahoo@yahoo.com", "HI! this a test mail from yahoo provider", null);
		hotmailProvider.sendMail("your-hotmail@hotmail.com", "HI! this a test mail from hotmail provider", null);
	}
}
