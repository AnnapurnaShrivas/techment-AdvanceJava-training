package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MySQL implements IDao {

	@Override
	public void databaseName() {
	System.out.println("Connected with MySQL Database");

	}

}
