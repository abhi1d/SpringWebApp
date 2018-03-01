package com.devopsbuddy.web.i18n;

import java.util.Locale;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class I18NService {

	private static final Logger LOG = (Logger) LoggerFactory.getLogger(I18NService.class);
	
	@Autowired
	private MessageSource messageSource;

	public String getMessage(String messageId) {
		LOG.info("Returning i18n text for messagID {}", messageId);
		Locale locale = LocaleContextHolder.getLocale();
		return getMessage(messageId, locale);
	}

	private String getMessage(String messageId, Locale locale) {
		// TODO Auto-generated method stub
		return messageSource.getMessage(messageId, null, locale);
	}
}
