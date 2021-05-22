package com.springboot.app.entity;

import java.util.Collection;

import javax.persistence.*;


import lombok.Data;

@Entity
@Data
@Table(name="products")
public class Product {
		@Id 
		@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")	
	    private Long id;
		
		@Column
	    private String name;

	  
	    @ManyToMany
	    @JoinTable(name = "categories_product",
	        joinColumns = @JoinColumn(name = "categories_id"),
	        inverseJoinColumns = @JoinColumn(name = "product_id"))
	    private Collection<Categories> categoy_products;
	    @ManyToMany
	    @JoinTable(name = "supliers_product",
	        joinColumns = @JoinColumn(name = "product_id"),
	        inverseJoinColumns = @JoinColumn(name = "supliers_id"))
	    private Collection<Suplier> suplier_products;
	   
}