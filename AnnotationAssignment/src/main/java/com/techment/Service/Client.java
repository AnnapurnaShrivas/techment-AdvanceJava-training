package com.techment.Service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.model.Employee;


public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.techment");
        context.refresh();

      
        Employee employee = (Employee)context.getBean("employee");
        employee.displayInfo();
	}

}