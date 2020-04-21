package com.jackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jackson.model.Mailer;
import com.jackson.model.Member;

@SpringBootApplication
public class GoogleMedicine1Application {

	public static void main(String[] args) {
		SpringApplication.run(GoogleMedicine1Application.class, args);
		//Mailer.send("jacksonpaul.berthomieux@gmail.com","jojojo",Member.email,"Hello Purush","Thank you for the help. This email is sent from my appplication");
	}

}
