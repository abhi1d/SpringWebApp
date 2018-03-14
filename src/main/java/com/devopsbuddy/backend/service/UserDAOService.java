package com.devopsbuddy.backend.service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.devopsbuddy.backend.persistence.domain.backend.User;

@Repository
@Transactional
public class UserDAOService {
		
	@PersistenceContext
	private EntityManager entityManager;
	
	/*public long insert( User user){
		entityManager.persist(user);
		System.out.println("User Id" + user.getId());
		return user.getId();
	}*/
}
