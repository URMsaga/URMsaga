package com.springboot.mirafra;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMirafra {

	@RequestMapping("/hello")
	public String sayHello() {
		return "welcome to mirafra !!!!";
	}

}
