package com.assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.model.Todo;
import com.assignment.service.TodoService;

@RestController
public class TodoController {
	@Autowired
	TodoService todoService;

	@GetMapping(value = "/todo")
	public List<Todo> getTask() {
		return todoService.getTask();
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteTask(@PathVariable("id") int id) {
		return todoService.deleteTask(id);
	}

	@PostMapping(value = "/add")
	public String addTask(@RequestBody Todo todo) {
		todoService.addTask(todo);
		return "Task saved successfully";
	}

	@GetMapping(value = "/getTask/{id}")
	public Optional<Todo> getTaskById(@PathVariable("id") int id) {
		return todoService.getTaskById(id);
	}

}
