package com.techment.Assignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
////// NAMED QUERY
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		System.out.println("==============Inserting===========");
		Author author = new Author();
		author.setAuthorId(1);
		author.setFirstName("Khushwant");
		author.setLastName("Singh");
		author.setPhoneNo(98765432);
		

		
		
		
		em.persist(author);
		
		
		System.out.println("==============Finding===========");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id no. to show the details");
		int a=scanner.nextInt();
		
		Author author1= em.find(Author.class, a);
        System.out.println("Author id : " + author1.getAuthorId());
        System.out.println("Author name : " + author1.getFirstName()+" "+author1.getLastName());
        System.out.println("Author Contact No. : "+author1.getPhoneNo());

        
        System.out.println("==============Updating===========");

          Query query = em.createQuery( "update Author SET firstName='Shubham' where authorId=5");  
          query.executeUpdate();         
     
        System.out.println("==============Deleting===========");
		 Query query1 = em.createQuery( "delete from Author where authorId=8");  
         query1.executeUpdate();

		em.persist(author1);
		em.getTransaction().commit();
		em.close();
	
		

	}

}