package com.devopsbuddy.backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import com.devopsbuddy.web.domain.frontend.FeedbackPOJO;

public abstract class AbstractEmailService implements EmailService {
	
@Value("${default.to.address}")	
private String defaultToAddress;
  protected SimpleMailMessage prepareSimpleMailMessageFromFeedbackPOJO(FeedbackPOJO feedback)
  {
	  SimpleMailMessage message = new SimpleMailMessage();
	  message.setTo(defaultToAddress);
	  message.setFrom(feedback.getEmail());
	  message.setSubject("[DevOps Buddy]: Feedback received from " + feedback.getFirstName() + "" + feedback.getLastName() + "!");
	  message.setText(feedback.getFeedback());
	  return message;
  }
            
  @Override
public void sendFeedbackEmail(FeedbackPOJO feedbackPOJO) {
	sendGenericEmailMessage(prepareSimpleMailMessageFromFeedbackPOJO(feedbackPOJO));
  }


	
}



