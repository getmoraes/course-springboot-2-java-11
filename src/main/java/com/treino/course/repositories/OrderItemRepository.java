package com.treino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
}
