package com.crud.webapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class WebapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebapplicationApplication.class, args);
	}

}
