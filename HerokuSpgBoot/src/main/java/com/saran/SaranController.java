package com.saran;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaranController {
	
	
	@GetMapping("/")
	public String getHeroku() {
		return "Welcome to Heroku";
	}

}
