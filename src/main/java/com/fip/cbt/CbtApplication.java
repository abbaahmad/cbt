package com.fip.cbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CbtApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbtApplication.class, args);
	}
	//https://stackoverflow.com/questions/70042038/springboot-create-document-in-mongodb-on-startup-if-not-exists
	/*@Bean
	public CommandLineRunner initialize(MyRepository myRepository) {

		return args -> {
			// Insert elements into myRepository
		};
	}*/
}
