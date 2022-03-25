package com.treino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
