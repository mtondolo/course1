package com.udacity.jdnd.course1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	//@Bean
	//public String message() {
		//System.out.println("Creating message bean");
		//return "Hello, Spring!";
	//}

	//@Bean
	//public String uppercaseMessage(ReviewApplication messageService) {
		//System.out.println("Creating uppercaseMessage bean");
		//return messageService.uppercase();
	//}

	//@Bean
	//public String lowercaseMessage(ReviewApplication messageService) {
		//System.out.println("Creating lowercaseMessage bean");
		//return messageService.lowercase();
	//}

}
