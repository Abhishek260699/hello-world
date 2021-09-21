package student.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.com.model.Student;
import student.com.repository.Repository;

@Service
public class StudentService {
	@Autowired
	Repository stu;
	
	public List<Student>getStudents(){
		List<Student>list = new ArrayList<>();
		stu.findAll().forEach(student -> list.add(student));
		return list;
	}
	
	public void addStudent(Student student) {
		stu.save(student);
	}
	
	public Optional<Student> getById(int id) {
		return stu.findById(id);
	}
	
	public String deleteStudent(int id) {
		Student student = stu.findById(id).orElse(null);
		if(student != null) {
			stu.deleteById(id);
			return"Student number "+ id + " is deleted.";
		}
		else {
			return "Student number "+ id + " not found.";
		}
	}
	
	public String calculateResult(int id) {
		Student student = stu.findById(id).orElse(null);
		if(student!= null) {
			int sum = student.getEnglishMarks()+student.getMathsMarks()+student.getScienceMarks();
			double percentage = ((sum * 100)/400);
			if(percentage >= 75 && percentage <= 100 ) {
				return "Percantage of student with id "+ id + " is " + percentage +  " % and Grade is A." ;
			}else if(percentage >= 50 && percentage < 75) {
				return "Percantage of student with id "+ id + " is " + percentage +  " % and Grade is B." ;
			}else if(percentage >= 35 && percentage < 50) {
				return "Percantage of student with id "+ id + " is " + percentage +  " % and Grade is C." ;
			}else {
				return "Percantage of student with id "+ id + " is " + percentage +  " % and Grade is E(Fail).";
			}
			 
		}else {
			return "Student "+ id + " not found."; 
		}
	}
}
