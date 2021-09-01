package com.techment.dao;
import org.springframework.stereotype.Component;
@Component
public class MorningGreeting implements Greeting {

	String greeting ="Good Morning"; 
	
	
	
//	public MorningGreeting(String greeting) {
//		super();
//		this.greeting = greeting;
//	}
	
	



	public String getGreeting() {
		return greeting;
	}



	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}



	public MorningGreeting() {
		super();
	}



	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

}
