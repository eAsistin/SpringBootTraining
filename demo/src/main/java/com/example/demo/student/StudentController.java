package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class StudentController {
	
	private final StudentService sd;
	
	@Autowired
	public  StudentController(StudentService sd) {
		this.sd =sd;
		}
	
	@GetMapping
	public List<Student> getStudents() {
		return sd.getStudents();
	}
	
	//TODO: fix register method later
	
}
