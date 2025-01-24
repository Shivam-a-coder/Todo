package com.app.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Disable all Database related auto configuration in Spring Boot when you don't need database use this line
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

@SpringBootApplication
public class TodoappApplication {
	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}
}
