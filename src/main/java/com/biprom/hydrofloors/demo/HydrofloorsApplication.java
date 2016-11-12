package com.biprom.hydrofloors.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.biprom.hydrofloors")
public class HydrofloorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HydrofloorsApplication.class, args);
	}
}
