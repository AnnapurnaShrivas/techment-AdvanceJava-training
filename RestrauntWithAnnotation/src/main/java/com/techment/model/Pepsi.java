package com.techment.model;

import org.springframework.stereotype.Repository;

@Repository
public class Pepsi implements iSoftDrink {

	@Override
	public void drink() {
		System.out.println("You are Drinking Pepsi");

	}

}
