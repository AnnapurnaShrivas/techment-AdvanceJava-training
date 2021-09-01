package com.techment.model;

import org.springframework.stereotype.Repository;

@Repository
public class Milk implements iHotDrink {

	@Override
	public void drink() {
		System.out.println("You are Drinking Milk");

	}

}
