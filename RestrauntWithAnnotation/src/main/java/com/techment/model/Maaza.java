package com.techment.model;

import org.springframework.stereotype.Repository;

@Repository
public class Maaza implements iSoftDrink {

	@Override
	public void drink() {
		System.out.println("You are Drinking Maaza");

	}

}
