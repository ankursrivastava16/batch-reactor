package com.springexample.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springexample.boot.repository.service.DepartmentService;


@SpringBootApplication
public class MainRunner implements CommandLineRunner {
	
	@Autowired
	private DepartmentService departmentService;

	public static void main(String[] args) {
		SpringApplication.run(MainRunner.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.departmentService.findByName("IT"));		
	}

}