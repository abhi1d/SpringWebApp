package com.example.SpringWebApp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.devopsbuddy.DevopsbuddyApplication;
import com.devopsbuddy.web.i18n.I18NService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DevopsbuddyApplication.class)
@WebAppConfiguration

public class SpringWebAppApplicationTests {

	@Autowired
	private I18NService i18NService;

	
	@Test
	public void testMessageByLocaleService() throws Exception {
		String exceptionResult = "Abhishek";
		String messageId = "index.main.callout";
		
		String actual = i18NService.getMessage(messageId);
		Assert.assertEquals("The actual and expected Strings don't match", exceptionResult, actual);
	}

}
