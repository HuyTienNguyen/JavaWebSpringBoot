package com.springboot.app.entity;
import java.util.Collection;
import javax.persistence.*;

import lombok.Data;


@Entity
@Data
@Table(name="supliers")
public class Suplier {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")	
	    private Long id;
		@Column
		private String name;
		@Column
		private String address;
		@Column(length=20)
		private String phone;
		@Column
		private String email;
		@Column
		private String description;
		@Column(length=2)
		private int status;
		 @ManyToMany(mappedBy = "suplier_products")
		    private Collection<Product> products;
}