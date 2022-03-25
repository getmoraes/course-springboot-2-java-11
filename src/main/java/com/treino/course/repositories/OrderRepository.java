package com.treino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
