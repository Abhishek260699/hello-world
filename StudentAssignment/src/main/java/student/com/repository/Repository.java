package student.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.com.model.Student;

public interface Repository extends JpaRepository<Student, Integer>{

}
