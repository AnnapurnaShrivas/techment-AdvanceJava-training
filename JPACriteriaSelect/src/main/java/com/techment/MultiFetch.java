package com.techment;
import com.techment.StudentEntity;  
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;  
public class MultiFetch
{  
      
      
	public static void main(String args[]) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<StudentEntity> cq = cb.createQuery(StudentEntity.class);

		Root<StudentEntity> stud = cq.from(StudentEntity.class);

		cq.multiselect(stud.get("s_id"), stud.get("s_name"), stud.get("s_age"));

		CriteriaQuery<StudentEntity> select = cq.select(stud);
		TypedQuery<StudentEntity> q = em.createQuery(select);

		List<StudentEntity> list = q.getResultList();

		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");

		for (StudentEntity s : list) {
			System.out.print(s.getS_id());
			System.out.print("\t" + s.getS_name());
			System.out.println("\t" + s.getS_age());
		}

		em.getTransaction().commit();
		em.close();
		emf.close();

	}
}