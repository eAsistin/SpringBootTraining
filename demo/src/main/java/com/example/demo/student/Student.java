package com.example.demo.student;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Student {
	@Id
	@SequenceGenerator(
			name= "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence")
	
	private long id;
	private String name;
	private String email;
	@Transient
	private int age;
	private LocalDate DOB;
	
	
	public Student() {
		super();
	}
	
	
	public Student(long id, String name, String email,  LocalDate dOB) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		DOB = dOB;
	}
	
	

	public Student(String name, String email,  LocalDate dOB) {
		super();
		this.name = name;
		this.email = email;
		DOB = dOB;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return Period.between(this.DOB, LocalDate.now()).getYears();
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", DOB=" + DOB + "]";
	}

	 
}
