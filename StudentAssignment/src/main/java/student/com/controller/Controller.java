package student.com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import student.com.model.Student;
import student.com.service.StudentService;

@RestController
public class Controller {
	@Autowired
	StudentService studentService;
	
	@GetMapping(value = "/studentInfo")
	public List<Student>getAllStudents(){
		return studentService.getStudents();
	}
	
	@PostMapping(value = "/add")
	public String addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return "Student info is saved";
	}
	
	@GetMapping(value = "/student/{id}")
	public Optional<Student> getById(@PathVariable int id) {
		return studentService.getById(id);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}
	
	@GetMapping("/result/{id}")
	public String calculateResult(@PathVariable int id) {
		return studentService.calculateResult(id);
	}
}
