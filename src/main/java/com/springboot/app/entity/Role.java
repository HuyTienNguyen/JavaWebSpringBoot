package com.springboot.app.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;


public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")	
	private Long id;
	
	@Column(name="name",length=255)
	private String name;
	
	 
}
