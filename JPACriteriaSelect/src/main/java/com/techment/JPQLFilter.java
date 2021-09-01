package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLFilter {

	public static void main(String[] args) {
		
		
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory( "student" ); 
		  EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
          
        Query q1 = em.createQuery("Select s from StudentEntity s where s.s_age between 22 and 28");  
       
        @SuppressWarnings("unchecked")  
        List<StudentEntity> l1 =  (List<StudentEntity>)q1.getResultList();
        
        System.out.println("Between Clause");  
        System.out.print("s_id");  
        System.out.print("\t s_name");  
        System.out.println("\t s_age");  
          
         for(StudentEntity s:l1)  
         {  
         System.out.print(s.getS_id());  
         System.out.print("\t"+s.getS_name());  
         System.out.println("\t"+s.getS_age());  
         }  
           
           
         Query q2 = em.createQuery("Select s from StudentEntity s where s.s_age IN(27,22,23)");  
          
           @SuppressWarnings("unchecked")  
           List<StudentEntity> l2 =  (List<StudentEntity>)q2.getResultList(); 
           
           System.out.println("IN Clause");  
           System.out.print("s_id");  
           System.out.print("\t s_name");  
           System.out.println("\t s_age");  
             
            for(StudentEntity s:l2)  
            {  
            System.out.print(s.getS_id());  
            System.out.print("\t"+s.getS_name());  
            System.out.println("\t"+s.getS_age());  
            }  
              
            Query q3 = em.createQuery("Select s from StudentEntity s where s.s_name like '%a%'");
            
            @SuppressWarnings("unchecked")  
            List<StudentEntity> l3 =  (List<StudentEntity>)q3.getResultList();  
              
             System.out.println("Like Clause");  
             System.out.print("s_id");  
             System.out.print("\t s_name");  
             System.out.println("\t s_age");  
               
              for(StudentEntity s:l3)  
              {  
              System.out.print(s.getS_id());  
              System.out.print("\t"+s.getS_name());  
              System.out.println("\t"+s.getS_age());  
              }  
        
      em.getTransaction().commit();  
      em.close();  
      emf.close();    

	}

}
