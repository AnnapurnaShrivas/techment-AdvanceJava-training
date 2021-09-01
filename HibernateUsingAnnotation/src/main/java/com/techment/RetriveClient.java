package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetriveClient {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		// through this ... we can retrive only one object
		Student student = (Student)session.load(Student.class, new Integer(4));   // in new Integer().... we give id as a argument
		
		System.out.println("id "+student.getStudentId() +" name = "+student.getName()+" departmemt = "+student.getDept());
		
		transaction.commit();
		

	}

}
