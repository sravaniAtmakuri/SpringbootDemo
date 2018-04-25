package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@RequestMapping("/example")
	public String getExample() {
		return "hello world";
	}
	@RequestMapping("/example123")
	public String getExample123() {
		return "hello world123";
	}
	

}
