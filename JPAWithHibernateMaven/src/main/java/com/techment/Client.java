package com.techment;

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
		Product product = new Product();
		product.setId(12);
		product.setName(" prime");
		product.setCategory("smart Phone");
		product.setPrice(20500);
		
		
		System.out.println("==============Finding===========");
		Product product1= em.find(Product.class, 2);
        System.out.println("product id : " + product1.getId());
        System.out.println("product name : " + product1.getName());
        System.out.println("product category : " + product1.getCategory());
        System.out.println("product price : " + product1.getPrice());
        
        System.out.println("==============Updating===========");

          Query query = em.createQuery( "update Product SET price=55000 where id=5");  
          query.executeUpdate();  
//        em.find(Product.class, 2);
//        System.out.println("product id : " + product.getId());
//        System.out.println("product name : " + product.getName());
//        System.out.println("product category : " + product.getCategory());
//        System.out.println("product price : " + product.getPrice());
//        
//        //updating in the database
//        
//        product.setName("i phone");
//        product.setPrice(82000);
        
        
        System.out.println("==============Deleting===========");
		//em.find(Product.class, 2);
		
		 Query query1 = em.createQuery( "delete from Product where id=1");  
         query1.executeUpdate();
		
//        System.out.println("product id : " + product.getId());
//        System.out.println("product name : " + product.getName());
//        System.out.println("product category : " + product.getCategory());
//        System.out.println("product price : " + product.getPrice());
//        em.remove(product);
        
        
       
		
		em.persist(product1);
		em.getTransaction().commit();
		em.close();
	
		

	}

}