package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClientED {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
	 Library library = new Library();
	 library.setName("ABC");
		em.persist(library);
		
		Book book = new Book();
		book.setBookName("Core java");
		book.setAuthor("bala");
		book.setLibrary(library);
		
		
		Book book2 = new Book();
		book2.setBookName("Core Python");
		book2.setAuthor("Lemda");
		book2.setLibrary(library);
		em.persist(book);
		em.persist(book2);
		
		System.out.println("==========inserted=========");
		
		
		em.getTransaction().commit();
	}

}
