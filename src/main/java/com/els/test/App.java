package com.els.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
@RequestMapping("/app")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}

}
