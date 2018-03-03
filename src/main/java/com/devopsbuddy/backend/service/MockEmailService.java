package com.devopsbuddy.backend.service;

import org.jboss.logging.Logger;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService{

	private static final Logger LOG = Logger.getLogger(MockEmailService.class);
	@Override
	public void sendGenericEmailMessage(SimpleMailMessage message) {
		// TODO Auto-generated method stub
		LOG.debug("Simulating an email service ...");
		LOG.info(message.toString());
		LOG.debug("Email sent.");
		
	}

}
