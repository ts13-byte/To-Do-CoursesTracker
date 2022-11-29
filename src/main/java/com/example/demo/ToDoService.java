package com.example.demo;

import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	private static List<ToDo> todos=new ArrayList<>();

	static {
		todos.add(new ToDo(1, "sara", "Learn Java", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(1, "sara", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new ToDo(1, "sara", "Learn Spring", LocalDate.now().plusYears(3), false));
	}

	public List<ToDo> findByUserName(String username) {

		return todos;
	}

}
