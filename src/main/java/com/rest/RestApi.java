package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;

@SpringBootApplication
public class RestApi {

	public static void main(String[] args) {
		SpringApplication.run(RestApi.class, args);
	}
	
	public void configureContentNegotiation(
			ContentNegotiationConfigurer configurer) {
		// Simple strategy: only path extension is taken into account
		configurer.favorPathExtension(true).
			ignoreAcceptHeader(true).
			useJaf(false).
			defaultContentType(MediaType.TEXT_HTML).
			mediaType("html", MediaType.TEXT_HTML).
			mediaType("xml", MediaType.APPLICATION_XML).
			mediaType("json", MediaType.APPLICATION_JSON);
	}

}
