package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController {
	@Autowired
	private ToDoService toDoService;

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {

		List<ToDo> listOfTodos = toDoService.findByUserName("sara");
		model.put("listOfTodos", listOfTodos);
		return "listToDos";
	}
}
