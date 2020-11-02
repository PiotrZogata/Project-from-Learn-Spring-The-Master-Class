package com.task;

//https://www.infoworld.com/article/3543268/junit-5-tutorial-part-2-unit-testing-spring-mvc-with-junit-5.html

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManagmentJpaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagmentJpaRestApplication.class, args);
	}

}
