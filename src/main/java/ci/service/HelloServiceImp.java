package ci.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements HelloService {

	@Override
	public String sayHello() {
		System.out.println("[/hello] was called");
		return "hello from spring RESTful web server!";
	}

}
