package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return List.of(new Student(1L, "Emar", "test@test.com",21,LocalDate.now()));
	}
}
