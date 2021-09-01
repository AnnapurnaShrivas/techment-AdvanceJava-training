package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveDemoWithHQL {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		//Query<StudentDto> query = session.createQuery("")
		
		
		
		

		session.close();
		sessionFactory.close();
		
	}

}
