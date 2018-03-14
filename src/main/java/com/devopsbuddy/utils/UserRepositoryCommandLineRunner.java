package com.devopsbuddy.utils;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import com.devopsbuddy.backend.persistence.domain.backend.UserRole;
import com.devopsbuddy.backend.persistence.repositories.UserRepository;
import com.devopsbuddy.backend.persistence.repositories.UserRolesRepository;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserRolesRepository userRolesRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		
		/*
		 * Insert Values into USERS
		 */
		
		User user = new User();
		user.setEmail("abhi@gmail.com");
		user.setEnabled(1);
		user.setPassword("abc123");
		user.setUserName("abhi");
		
		userRepository.save(user);
		log.info("New User is created : " + user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User is retrived : " + userWithIdOne);

		List<User> users = (List<User>) userRepository.findAll();
	    
		 log.info("Users : " + users);
		
	   
		/*
		 * Insert values into UserRole 
		 */
		 
		 
		 UserRole user_role = new UserRole();
		 user_role.setRole("ADMIN");
		 user_role.setUserid(1L);
		 userRolesRepository.save(user_role);
	    
		 log.info("New User is created : " + user_role);
			
		 Optional<UserRole> userWithIdOne1 = userRolesRepository.findById(1L);
		log.info("User is retrived : " + userWithIdOne1);

		List<UserRole> user_roles = (List<UserRole>) userRolesRepository.findAll();
		    
		 log.info("Users : " + user_roles);
			
		 
		 
	}
	
}