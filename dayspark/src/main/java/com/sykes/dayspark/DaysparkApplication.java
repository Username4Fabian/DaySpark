package com.sykes.dayspark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaysparkApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaysparkApplication.class, args);
		System.out.println("Server started at http://localhost:8080/");
	}

}
