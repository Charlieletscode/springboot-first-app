package com.springboot.firstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//+
//@Controller
//=

@RestController
public class HelloWorldController {
	//get, post, put, delete
	// get http method
	// get http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World.....";
	}
}
