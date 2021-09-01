package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.service.DatabaseService;

public class RestrauntClient {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.techment");
        context.refresh();

        
        DatabaseService dbservice = (DatabaseService) context.getBean("databaseService");
        dbservice.details();
        
	}

}
