package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages= "com.controller")
//@ComponentScan(basePackages= {"com.controller","com.respository", "com.model"})
public class SpringBootRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulApplication.class, args);
	}
}
