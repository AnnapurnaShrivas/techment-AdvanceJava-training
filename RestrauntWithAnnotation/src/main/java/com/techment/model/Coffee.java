package com.techment.model;

import org.springframework.stereotype.Repository;

@Repository
public class Coffee implements iHotDrink {


	@Override
	public void drink() {
		System.out.println("You are Drinking Coffee");
		
	}

	
}
