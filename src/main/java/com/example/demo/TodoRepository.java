package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<ToDo, Integer> {
	
	public List<ToDo> findByUserName(String username);
	
	

}
