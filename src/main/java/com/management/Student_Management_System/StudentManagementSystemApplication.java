package com.management.Student_Management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		data Student1 = new data("rames","kumar",17,"ram@gmail.com","8295306204");
//		studentRepository.save(Student1);
//		data Student2 = new data("ram","kumar",17,"r@gmail.com","9632242072");
//		studentRepository.save(Student2);
//		data student3 = new data("r","kumar",17,"ra@gmail.com","3892595383");
//		studentRepository.save(student3);
	}
}
