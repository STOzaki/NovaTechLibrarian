package com.st.novatech.librarianapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:database-config.properties")
@SpringBootApplication
public class LibrarianAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarianAppApplication.class, args);
		
	}
}
