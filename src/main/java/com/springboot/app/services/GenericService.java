package com.springboot.app.services;

import java.util.List;

public interface GenericService<T,K> {
	List<T> findAll();
    T save(T entity);
    T findById(K id);
    void delete(T entity);
    void deleteById(K id);
   
}
