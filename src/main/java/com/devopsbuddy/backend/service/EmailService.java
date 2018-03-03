package com.devopsbuddy.backend.service;

import org.springframework.mail.SimpleMailMessage;

import com.devopsbuddy.web.domain.frontend.FeedbackPOJO;

public interface EmailService {
    
	public void sendFeedbackEmail(FeedbackPOJO feedbackPOJO);
	public void sendGenericEmailMessage(SimpleMailMessage prepareSimpleMailMessageFromFeedbackPOJO);
	
}
