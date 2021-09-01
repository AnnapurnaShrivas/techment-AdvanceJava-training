package com.techment;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class JPQLClient2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();

		em.getTransaction().begin();
			
		Address address = new Address();
		address.setDorrNo(101);
		address.setStreetName("Devrikhurd");
		address.setCityName("Bilaspur");
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Annapurna");
		employee.setDesignation("Developer");
		employee.setAddress(address);
		
		em.persist(address);
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
	}

}
