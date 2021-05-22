package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.entity.Categories;

@Repository
public interface CategoryRepository extends JpaRepository<Categories, Long> {

}
