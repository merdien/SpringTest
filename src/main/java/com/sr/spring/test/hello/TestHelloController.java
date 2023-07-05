package com.sr.spring.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestHelloController {
	
	
	@RequestMapping("/test/hello")
	@ResponseBody
	public String helloWorld( ) {
		return "Hello World";
	}
	
	

}
