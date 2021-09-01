package com.techment;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class HQLSelect {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Query<Student> query = session.createQuery("select s from Student s");
		List<Student> studentList = query.list();
		
		System.out.println("====================");
		studentList.forEach(System.out::println);
		
		System.out.println("======================");
		studentList.forEach(s->System.out.println(s.getStudentId()+" "+s.getName()+" "+s.getDept()));
		
		System.out.println("\n\n\nselect only specific coloum");
		
		System.out.println("only specific");

		Query query2= session.createQuery("select s.studentId,s.name from Student s");

		List<Student> studentList2 = query2.list();


        // Agar isme Specific coloum se fetch krna ho to Iterator use krte h
		Iterator it = studentList2.iterator();

		while(it.hasNext())
		{
			Object o[] = (Object[])it.next();

			System.out.println(o[0]+ " "+o[1]);

			System.out.println("----------------");
		}
		
		
		session.close();
		sessionFactory.close();

	}

}
