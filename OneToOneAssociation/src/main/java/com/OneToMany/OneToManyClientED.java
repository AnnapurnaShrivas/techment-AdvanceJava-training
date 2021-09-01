package com.OneToMany;

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
		
		EmployeeD e1= new EmployeeD("Annuuu","hr");
		EmployeeD e2= new EmployeeD("priya","devplr");
		
		//To store in DB
		em.persist(e1);
		em.persist(e2);
		
		//to store all employee in List as it become many
		List<EmployeeD> emplDs = new ArrayList<>();
		emplDs.add(e1);
		
		DepartmentE d1 = new DepartmentE();
		d1.setName("Developer");
		d1.setEmployees(emplDs);
		
		em.persist(d1);
		
		
		System.out.println("==========inserted=========");
		
		
		em.getTransaction().commit();
	}

}
