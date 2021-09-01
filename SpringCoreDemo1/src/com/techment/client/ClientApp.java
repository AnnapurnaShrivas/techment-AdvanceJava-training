package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.model.Bank;

public class ClientApp {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("object.xml");  // it will point to the file
		BeanFactory factory = new XmlBeanFactory(resource);  // it will
		
		Bank bank = (Bank)factory.getBean("bankobj"); // request to create the object
		bank.displayBankDetails();
		

	}

}
