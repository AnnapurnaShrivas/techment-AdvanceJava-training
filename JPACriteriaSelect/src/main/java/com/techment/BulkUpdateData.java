package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BulkUpdateData {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "student" );
		
		  EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
           Query query = em.createQuery( "update StudentEntity SET s_age=45 where s_id>3"); 
           
           query.executeUpdate();  
           
           em.getTransaction().commit();  
           em.close();  
           emf.close();

	}

}
