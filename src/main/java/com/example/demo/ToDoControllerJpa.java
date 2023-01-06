package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoControllerJpa {

	
	@Autowired
	private TodoRepository todoRepository;

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {

		List<ToDo> listOfTodos = todoRepository.findByUserName("sara");
		model.put("listOfTodos", listOfTodos);
		return "listToDos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String ShowNewPageAfterAdd(ModelMap model) {
		String username = (String) model.get("name");
		ToDo todo = new ToDo(0, username, "default desc", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "todo";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addNewTodo(ModelMap model, @Valid ToDo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "todo";
		}
		String username = (String) model.get("name");
		todo.setUserName("sara");
		todoRepository.save(todo);
		// toDoService.addTodo(username, todo.getDescription(),todo.getTargetDate(),
		// todo.isDone());
		return "redirect:list-todos";
	}

	@RequestMapping(value = "delete-todo")
	public String DeleteTodo(@RequestParam int id) {
		todoRepository.deleteById(id);
		return "redirect:list-todos";

	}

	@RequestMapping(value = "update-todo", method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		ToDo todo = todoRepository.findById(id).get();
		model.addAttribute("todo", todo);
		return "todo";

	}

	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String UpdateTodo(ModelMap model, @Valid ToDo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "todo";
		}
		String username = (String) model.get("name");
		todo.setUserName("sara");
		todoRepository.save(todo);
		return "redirect:list-todos";
	}

}
