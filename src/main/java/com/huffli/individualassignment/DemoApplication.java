package com.huffli.individualassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8080");
		SpringApplication.run(DemoApplication.class, args);
	}

}
