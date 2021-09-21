package com.student.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired 
	StudentService studentService; 
	
	@RequestMapping("/{rollNo}")
	public Student getRollNo(@PathVariable("rollNo") Integer rollNo) {
		return studentService.findByRollNo(rollNo);
		
	}
	
	@RequestMapping("/all")
	public Hashtable<Integer,Student> getAll(){
		return studentService.findAll();
	}
	
}
