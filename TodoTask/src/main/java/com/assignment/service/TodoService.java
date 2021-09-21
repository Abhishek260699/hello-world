package com.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.model.Todo;
import com.assignment.repository.TodoRepository;

@Service
public class TodoService {
	@Autowired
	TodoRepository todoRepo;

	public List<Todo> getTask() {
		List<Todo> list = new ArrayList<Todo>();
		todoRepo.findAll().forEach(task -> list.add(task));
		return list;
	}

	public void addTask(Todo todo) {
		todoRepo.save(todo);
	}

	public String deleteTask(int id) {
		Todo todo = todoRepo.findById(id).orElse(null);
		if (todo != null) {
			todoRepo.deleteById(id);
			return "Task " + id + " deleted successfully.";
		} else {
			return "Inappropriate task id ";
		}
	}

	public Optional<Todo> getTaskById(int id) {
		return todoRepo.findById(id);
	}
}
