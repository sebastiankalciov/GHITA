package com.ghita.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GhitaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhitaApplication.class, args);
	}
	@GetMapping("/home")
	public String home() {
		return "salut";
	}


}
