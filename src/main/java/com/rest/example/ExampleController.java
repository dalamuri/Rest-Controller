package com.rest.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

	Example example = new Example();
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@RequestMapping(value="/{id}", produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
					headers = {"Accept=application/xml", "Accept=application/json"})
	@ResponseStatus(HttpStatus.OK)
	public Example exampleXML(@PathVariable int id) {
		example.setId(id);
		example.setName("Sougandh");
		return example;
	}
	
}
