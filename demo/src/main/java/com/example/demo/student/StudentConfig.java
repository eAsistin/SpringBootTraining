package com.example.demo.student;

import java.time.LocalDate;
import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class StudentConfig {
	@Bean
     CommandLineRunner cmlnrn (StudentRepository repo) {
    	 return args -> {
    		 Student emar = new Student(1L,"emar","test@test.com",LocalDate.of(1995, 4, 19));
    		 Student angel = new Student("angel","test1@test.com",LocalDate.of(1994, 6, 19));
    		 repo.saveAll(List.of(emar,angel));
    	 };
     }
}
