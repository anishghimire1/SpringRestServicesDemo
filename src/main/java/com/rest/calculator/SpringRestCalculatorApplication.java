package com.rest.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.rest"})
public class SpringRestCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestCalculatorApplication.class, args);
	}
}
