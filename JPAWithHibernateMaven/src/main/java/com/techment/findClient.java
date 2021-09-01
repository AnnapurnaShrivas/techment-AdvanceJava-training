package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class findClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
		
		Product product= em.find(Product.class, 2);
		System.out.println("Product Id is : "+product.getId());
		System.out.println("Product Name is : "+product.getName());
		System.out.println("Product Price is : "+product.getPrice());

	}

}