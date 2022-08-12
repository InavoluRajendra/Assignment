package com.org.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
	
	@GetMapping("/actuator/info")
	public int display()
	{
		return 123;
	}

}
