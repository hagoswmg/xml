package com.hagos.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlApplication.class, args);
		String APPLICATION_PORT = System.getenv("PORT");

		System.out.println("APPLICATION_PORT = " + APPLICATION_PORT);
		System.out.println("DB_URL = " + System.getenv("DB_URL"));
		System.out.println("DB_USERNAME = " + System.getenv("DB_USERNAME"));
		System.out.println("DB_PASSWORD = " + System.getenv("DB_PASSWORD"));
	}

}
