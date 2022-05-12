package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private  List myArrayList = new ArrayList();
	@GetMapping("/greeting")
	public List read(@RequestParam(value = "name", defaultValue = "World") String name) {
		return myArrayList;
	}
	@GetMapping("/insert")
	public List insert(@RequestParam(value = "name", defaultValue = "World") int name) {
		myArrayList.add(name);

		return myArrayList;
	}
}
