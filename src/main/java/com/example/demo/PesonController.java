package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Person;

@RestController
public class PesonController {
	@GetMapping("/persons")
	public Object getPerson() {
		Person[] ps=new Person[2];
		ps[0]=new Person(1,"a1");
		ps[1]=new Person(2,"a2");
		return ps;
		
	}
}
