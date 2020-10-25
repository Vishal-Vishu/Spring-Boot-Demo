package com.vishu.vishu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

	@RequestMapping("/")
	public String sayHello(){
		return "My Name is Vishal Vishu";
	}
	
	@RequestMapping("/name")
	public String returnGreeting(@RequestParam(name="nameval")String name){
		return "My Name is "+name;
	}
}
