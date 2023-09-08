package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EtronicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtronicsApplication.class, args);
		System.out.println("Connected");
	}

}
