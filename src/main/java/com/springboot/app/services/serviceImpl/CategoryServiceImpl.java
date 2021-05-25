package com.springboot.app.services.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.springboot.app.domain.Category;
import com.springboot.app.dto.CategoryDto;
import com.springboot.app.repository.CategoryRepository;
import com.springboot.app.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
    EntityManager entityManager;
	@SuppressWarnings("unchecked")
	@Override
	public List<CategoryDto> findAll() {
		 String sql = "select new com.springboot.app.dto.CategoryDto(entity) from Category as entity where (1=1) ";
		 Query q =  entityManager.createQuery(sql,CategoryDto.class);
		 return q.getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<CategoryDto> findAllWithNoChidren() {
		 String sql = "select new com.springboot.app.dto.CategoryDto(entity) from Category as entity where entity.parent_id IS NULL ";
		 Query q =  entityManager.createQuery(sql,CategoryDto.class);
		 return q.getResultList();
	}

	@Override
	public CategoryDto saveOrUpdate(CategoryDto dto, Long id) {
		
		// TODO Auto-generated method stub
		if(dto!=null) {
			Category entity =null;
			if(id!=null) {
				if(dto.getId() != null && dto.getId().equals(id)==false) {
					return null;
				}
				entity = categoryRepository.getOne(id);		
			}
			if(entity ==null) {
				entity =new Category();
			}
			entity.setName(dto.getName());
			entity.setStatus(dto.getStatus());		
			entity.setParent_id(dto.getParent_id());
			entity=categoryRepository.save(entity);		
			if(entity!=null)
				return new CategoryDto(entity);
		}
		
			return null;

	}

	@Override
	public CategoryDto getOne(Long id) {
		// TODO Auto-generated method stub		
		
		Category cate = categoryRepository.getOne(id);
			if(cate!=null)	   
		    return new CategoryDto(cate);				
		return null;
	}

	@Override
	public void delete(CategoryDto entity) {
		if(entity!=null)
		categoryRepository.removeByName(entity.getName());
		
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		if(id!=null)
		 categoryRepository.deleteById(id);
		
		// TODO Auto-generated method stub

	}



}
