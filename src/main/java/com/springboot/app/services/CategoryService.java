package com.springboot.app.services;

import java.util.List;

import com.springboot.app.domain.Category;
import com.springboot.app.dto.CategoryDto;


public interface CategoryService extends GenericService<Category, Long> {
	List<CategoryDto> findAll();

	CategoryDto saveOrUpdate(CategoryDto entity, Long id);

	CategoryDto getOne(Long id);

	void delete(CategoryDto entity);

	void deleteById(Long id);
	
}
