package ci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ci.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService service;
	
	@RequestMapping("/hello")
	public String hello(){
		return service.sayHello();
	}
}
