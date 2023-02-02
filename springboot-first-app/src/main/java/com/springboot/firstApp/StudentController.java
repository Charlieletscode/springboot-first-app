package com.springboot.firstApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	// http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Charlie", "Chung");
	}

	// http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Charlie","Chung"));
		students.add(new Student("Andrew","Young"));
		students.add(new Student("John","Cena"));
		students.add(new Student("Kobe","Bryan"));
		students.add(new Student("Dada","qin"));
		return students;
	}
}
