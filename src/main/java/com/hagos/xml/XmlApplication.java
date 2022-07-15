package com.hagos.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XmlApplication {

	public static void main(String[] args) {
		final String APPLICATION_PORT = System.getenv("PORT");
		SpringApplication.run(XmlApplication.class, args);
		System.out.println("APPLICATION_PORT = " + APPLICATION_PORT);
	}

}
