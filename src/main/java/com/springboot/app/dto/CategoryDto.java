package com.springboot.app.dto;


import java.util.Set;

import javax.persistence.ManyToMany;

import com.springboot.app.domain.Category;
import com.springboot.app.domain.Product;

public class CategoryDto   {	
	private Long id;
	private String name;	

	private Long parent_id;
	private Category parent;
	public Category getParent() {
		return parent;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	private int status;	
	

	@ManyToMany(mappedBy = "category_product")
	private Set<Product> products;
	public CategoryDto() {
		super();
	}
	public CategoryDto(Category entity) {
		if(entity!=null) {
		this.id= entity.getId();
		this.name= entity.getName();		
		this.status=entity.getStatus();
		this.parent=entity.getParent();
		this.parent_id=entity.getParent_id();		
		}
	}
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

	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public Long getParent_id() {
		return parent_id;
	}
	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}
	@Override
	public String toString() {
		return "CategoryDto [id=" + id + ", name=" + name + ", parent_id=" + parent_id + ", parent=" + parent
				+ ", status=" + status + ", products=" + products + "]";
	}

	
	


}
