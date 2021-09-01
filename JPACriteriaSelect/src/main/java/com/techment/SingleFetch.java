package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class SingleFetch {

	
	public static void main( String args[]) {  
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "student" );  
        
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
        CriteriaBuilder cb=em.getCriteriaBuilder();  
        CriteriaQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class); 
	
        
        Root<StudentEntity> stud=cq.from(StudentEntity.class);
        
        cq.select(stud);   
        
        CriteriaQuery<StudentEntity> select = cq.select(stud);
	TypedQuery<StudentEntity> q = em.createQuery(select);  
          List<StudentEntity> list = q.getResultList();  
  
          System.out.println("s_name");  
               
            
          for(StudentEntity s:list)  
          {  
          System.out.println(s.getS_name());  
      
        }  
            
em.getTransaction().commit();  
          em.close();  
          emf.close();    
     
}
}