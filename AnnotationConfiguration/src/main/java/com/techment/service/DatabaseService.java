package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.dao.Employee;
import com.techment.dao.IDao;

@Service      // we can also give object name also
//example @Service("dbName")   oterewise it will take classname as object name 

public class DatabaseService {

	@Autowired
	@Qualifier("mySQL")
	IDao dao;
	
	@Autowired
	Employee employee;
	public void displayDatabaseInfo() {
		
		dao.databaseName();
		employee.displayEmployeeInfo();
	}
	
}
