package com.springboot.app.entity;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;


public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")	
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="birthday")
	
	private Date birthday;
	
	@Column(name="address")
	
	private Date address;
	
	@Column(name="gender")
	private int gender;
	
	@Column(name="email")
	private String email;
	
	 
}
