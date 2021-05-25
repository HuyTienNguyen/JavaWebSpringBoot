package com.springboot.app.domain;

import java.util.Collection;
import java.util.Set;

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
	        joinColumns = @JoinColumn(name = "product_id"),
	        inverseJoinColumns = @JoinColumn(name = "categories_id"))
	    private Set<Category> category_product;
	    @ManyToMany
	    @JoinTable(name = "supliers_product",
	        joinColumns = @JoinColumn(name = "product_id"),
	        inverseJoinColumns = @JoinColumn(name = "supliers_id"))
	    private Set<Suplier> suplier_product;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Set<Category> getCategory_product() {
			return category_product;
		}
		public void setCategoy_product(Set<Category> category_product) {
			this.category_product = category_product;
		}
		public Set<Suplier> getSuplier_product() {
			return suplier_product;
		}
		public void setSuplier_products(Set<Suplier> suplier_product) {
			this.suplier_product = suplier_product;
		}
	    
	   
}