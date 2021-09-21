package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
