package com.devopsbuddy.web.controllers.advices;


import org.hibernate.validator.internal.util.logging.Log;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.web.domain.frontend.FeedbackPOJO;

import ch.qos.logback.classic.Logger;

@Controller
public class ContactController {

	public static final String FEEDBACK_MODEL_KEY = "feedback";
	public static final String CONTACT_US_VIEW_NAME = "contact/contact"; //folder/view name
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(ContactController.class);	
    
    @Autowired
    private EmailService emailService;
    
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contactGet(ModelMap model)
	{
		FeedbackPOJO feedbackPOJO = new FeedbackPOJO();
		model.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedbackPOJO);
		return ContactController.CONTACT_US_VIEW_NAME;
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String contactGet(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedbackPOJO feedback )
	{
		LOG.debug("feedback POJO content : {}",feedback);
		emailService.sendFeedbackEmail(feedback);
		return ContactController.CONTACT_US_VIEW_NAME;
	}
}
