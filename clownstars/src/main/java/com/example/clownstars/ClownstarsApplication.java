package com.example.clownstars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(

		info =@Info(

				title = "Clownstars",

				version = "1.1.2",

				description = "Clown Project",

				contact = @Contact(

						name = "Aravind",

						email = "aravind0@gmail.com"

						)

				)

	)
public class ClownstarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClownstarsApplication.class, args);
	}

}
