package com.treino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
