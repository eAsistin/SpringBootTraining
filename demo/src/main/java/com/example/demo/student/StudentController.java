package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")

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
	
	@PostMapping
	public void registerNewStudent(@RequestBody Student student) {
		sd.addNewStudent(student);
	}
}
