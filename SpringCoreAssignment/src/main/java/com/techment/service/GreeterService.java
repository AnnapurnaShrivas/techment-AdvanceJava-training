package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.techment.dao.Greeting;

@Component

public class GreeterService {

	
	
	@Autowired
	@Qualifier("goodDayGreeting")
	Greeting greeting;
	
	
	
//	public GreeterService(Greeting greeting) {
//		super();
//		this.greeting = greeting;
//	}



	public Greeting getGreeting() {
		return greeting;
	}



	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}



	public void printGreeting()
	{
		
		System.out.println(greeting.greet());
		
	}

	
}
