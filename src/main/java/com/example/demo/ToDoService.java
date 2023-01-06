package com.example.demo;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	private static List<ToDo> todos = new ArrayList<>();
	private static int countofTodos = 0;
	static {
		todos.add(new ToDo(++countofTodos, "sara", "Learn Java 1", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(++countofTodos, "sara", "Learn DevOps 1", LocalDate.now().plusYears(2), false));
		todos.add(new ToDo(++countofTodos, "sara", "Learn Spring 1", LocalDate.now().plusYears(3), false));
	}

	public List<ToDo> findByUserName(String username) {

		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		todos.add(new ToDo(++countofTodos, username, description, targetDate, done));

	}
	public void deletebyId(int id) {
		Predicate<? super ToDo> predicate
		=todo->todo.getId()==id;
		todos.removeIf(predicate);
	}

	public ToDo findById(int id) {
		Predicate<? super ToDo> predicate
		=todo->todo.getId()==id;
	    ToDo todo=todos.stream().filter(predicate).findFirst().get();
	    return todo;
	}

	public void updateToDo(@Valid ToDo todo) {
		// TODO Auto-generated method stub
		deletebyId(todo.getId());
		todos.add(todo);
	}

}
