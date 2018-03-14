package com.devopsbuddy.backend.persistence.domain.backend;

import javax.persistence.*;

@Entity
@Table(name="user_roles")
public class UserRole {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(name="user_role_id")
	private Long userroleid;
	
	@Column(name="userid")
	private Long userid;
	
	@Column(name="role")
	private String role;	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public UserRole() {
		
	}
	
	public UserRole(UserRole user_role) {
        this.role = user_role.role;
        this.userid = user_role.userid;
        this.userroleid = user_role.userroleid;       
               
   }

	public Long getUserroleid() {
		return userroleid;
	}

	public void setUserroleid(Long userroleid) {
		this.userroleid = userroleid;
	}	
	
}