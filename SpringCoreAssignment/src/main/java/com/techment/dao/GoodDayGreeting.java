package com.techment.dao;

import org.springframework.stereotype.Component;
@Component
public class GoodDayGreeting implements Greeting {

	String greeting ="Have a Good Day"; 
	
	
	
//	public GoodDayGreeting(String greeting) {
//		super();
//		this.greeting = greeting;
//	}


/*
	public String getGreeting() {
		return greeting;
	}



	public GoodDayGreeting() {
		super();
	}



	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

*/

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

}
