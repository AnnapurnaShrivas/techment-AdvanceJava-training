package com.techment;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MySqlDemo {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	void insertDate()
	{
		jdbcTemplate.execute("insert into employee values(201,'Arjun',35000)");
		System.out.println("data is inserted...");
	
	}
	
	//DriverManagerDataSource ds;
	
}
