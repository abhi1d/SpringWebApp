package com.devopsbuddy.backend.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SmtpEmailService extends AbstractEmailService{

	private static final Logger LOG = (Logger)Logger.getLogger(SmtpEmailService.class);
	
	@Autowired
	private MailSender mailSender;
	
	@Override
	public void sendGenericEmailMessage(SimpleMailMessage message) {
		LOG.debug("Sending email for");
		mailSender.send(message);
		LOG.info("Email sent");
	}
	

}
