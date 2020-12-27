package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Host;
import com.example.demo.domain.Person;

@RestController
public class HostService {
	@Value("${server.port}")
	int port;
	@GetMapping("/host")
	public Object getPerson() {
		Host host=new Host("127.0.0.1", port);
		return host;
	}
}
