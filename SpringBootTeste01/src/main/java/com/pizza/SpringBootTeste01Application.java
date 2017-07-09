package com.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.pizza" })
@EnableAutoConfiguration
public class SpringBootTeste01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTeste01Application.class, args);
	}
}
