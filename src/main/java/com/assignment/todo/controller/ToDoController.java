package com.assignment.todo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.todo.model.ToDo;
import com.assignment.todo.service.ToDoService;

@RestController
@RequestMapping("/api")
public class ToDoController {
	 @Autowired
	 ToDoService todoService;
	 
	 @RequestMapping(value="/todos", method=RequestMethod.POST)
	 public ToDo createToDo(@RequestBody ToDo todo) {
	     return todoService.createToDo(todo);
	 }
	 @RequestMapping(value="/todos", method=RequestMethod.GET)
	 public List<ToDo> readToDo() {
	     return todoService.getToDo();
	 }

	 @RequestMapping(value="/todos/{todo_ID}", method=RequestMethod.PUT)
	 public ToDo readToDo(@PathVariable(value = "todo_ID") Long id, @RequestBody ToDo todoDetails) {
	     return todoService.updateTodo(id, todoDetails);
	 }

	 @RequestMapping(value="/todos/{todo_ID}", method=RequestMethod.DELETE)
	 public void deleteToDo(@PathVariable(value = "todo_ID") Long id) {
		 todoService.deleteToDo(id);
	 }

}
