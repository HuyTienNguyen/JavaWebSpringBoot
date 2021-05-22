package com.springboot.app.entity;
import java.util.Collection;
import javax.persistence.*;

import lombok.Data;


@Entity
@Data
@Table(name="categories")
public class Categories {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")	
	    private Long id;
		@Column
		private String name;
		@Column(length=1)
		private int status;
		@Column 
		private Long parentId;
		  @ManyToMany(mappedBy = "categoy_products")
		    private Collection<Product> products;
		
}