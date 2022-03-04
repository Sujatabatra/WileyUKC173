package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.service.DummyService;

@RestController
public class MyDemoResource {
	
	@Autowired
	private DummyService dummyService;
	
	@GetMapping(path = "/demo",produces = MediaType.TEXT_PLAIN_VALUE)
	public String myGreetResource() {
		return dummyService.greet();
	}

	@GetMapping(path = "/my",produces = MediaType.TEXT_HTML_VALUE)
	public String myGreetResourceTwo() {
		return dummyService.greet();
	}
	
	@GetMapping(path = "/add/{n1}/{n2}")
	public int mySumResource(@PathVariable("n1") int number1,@PathVariable("n2") int number2) {
		return dummyService.sum(number1, number2);
	}
}
