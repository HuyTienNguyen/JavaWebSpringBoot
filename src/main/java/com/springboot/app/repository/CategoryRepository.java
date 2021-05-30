package com.springboot.app.repository;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.app.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
Long removeByName(String name);
@Query("select count(entity) FROM Category entity where entity.name =:name")
Long checkcate(String name);
}
