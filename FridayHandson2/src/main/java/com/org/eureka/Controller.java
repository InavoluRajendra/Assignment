package com.org.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/actuator/info")
	public String disp()
	{
		return "client1";
	}

}
