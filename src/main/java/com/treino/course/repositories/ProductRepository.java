package com.treino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
