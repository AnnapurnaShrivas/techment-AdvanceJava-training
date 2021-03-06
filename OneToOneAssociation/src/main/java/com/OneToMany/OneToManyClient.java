package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Course java = new Course(90, "java", 4);
		Course python = new Course(20, "Python", 3);
		Course bigData = new Course(45, "Big Data", 7);
		
		List<Course> courses = new ArrayList<Course>();
		
		courses.add(java);
		courses.add(python);
		courses.add(bigData);
//		courses.add(new Course(94, "SQL" , 1));
		
		em.persist(java);
		em.persist(python);
		em.persist(bigData);
		
		Student junaid = new Student();
		
		junaid.setId(1);
		junaid.setName("Annapurna");
		junaid.setCourse(courses);
		
		em.persist(junaid);
		
		System.out.println("==========inserted=========");
		
		
		em.getTransaction().commit();
	}

}
