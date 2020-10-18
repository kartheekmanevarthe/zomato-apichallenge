package com.example.apichallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example"})
public class ApichallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApichallengeApplication.class, args);
	}

}
