package com.marceloquadros.mu.frontendapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FrontendAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontendAppApplication.class, args);
	}


	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
