package com.devopsbuddy.backend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devopsbuddy.backend.persistence.domain.backend.User;

public interface UserRepository extends JpaRepository<User, Long>{

}