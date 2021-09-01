package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

import javax.persistence.Query;
//import org.hibernate.query.Query;
// this 2 lines are worked same for Query class

public class SelectUsingWhere {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("select s from Student s where s.dept=:x");
		query.setParameter("x", "hr");
		
		List<Student> list = query.getResultList();
		
		list.forEach(s->System.out.println(s.getStudentId()+" "+s.getName()+" "+s.getDept()));
		
		

		session.close();
		sessionFactory.close();
		
	}

}
