package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//this annotation has both response and controller annotations
public class HelloWorldController {

	//Get HTTP Method
	//URL in bracket, http://localhost:8080/hello-World

	@GetMapping("/hello-World")
	public String helloWorld() {
		return "Hello World!";
	}

}
