package com.techment.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   //<bean id="employee" class="com.techment.Employee">
//@Component and @Service .. they both worked same 
public class Employee {

	@Autowired
	Address address;
	
	public void displayInfo()
	{
		address.AddressDetails();
	}
	
}
