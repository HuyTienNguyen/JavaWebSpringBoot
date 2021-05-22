package com.springboot.app.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.entity.Categories;


public interface CategoryService extends GenericService<Categories, Long> {
	
}
