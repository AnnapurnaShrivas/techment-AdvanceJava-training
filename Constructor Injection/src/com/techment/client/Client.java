package com.techment.client;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.techment.model.Employee;
public class Client {

	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("object.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Employee emp=(Employee)factory.getBean("e");  
	    System.out.println(emp.toString());
	      
	}
}
