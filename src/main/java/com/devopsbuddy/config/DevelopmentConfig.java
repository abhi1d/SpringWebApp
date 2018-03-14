package com.devopsbuddy.config;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.MockEmailService;

import org.apache.catalina.startup.WebappServiceLoader;
import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by tedonema on 21/03/2016.
 */
@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/.devops/application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
    
    
    /*
     * This DevelopmentConfig Class for application-dev methods.
     * All the dev related Configurations are done here.
     * For the h2-console, we can give any type of url mapping.
     */
    
    @Bean
    public ServletRegistrationBean h2ConsoleServletRegistration() {
		
    	ServletRegistrationBean bean = new ServletRegistrationBean(new WebServlet());
    	bean.addUrlMappings("/console/*");
    	return bean;
    	
    }
}