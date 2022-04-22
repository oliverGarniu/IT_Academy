package com.example.springBootInitialDemo.S401.n2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class InitialController {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello, " + name;
	}

}
