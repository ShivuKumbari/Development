package com.common.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.common.entities.Organization;

public class GetSingeResult {
	
	public static void main(String[] args) {
	
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA_COMMON_ENTITIES");
		EntityManager manager=factory.createEntityManager();
				
		//Query query=manager.createQuery("Select o from Organization o where o.id = :se");
		Query query=manager.createNamedQuery("Find by ID");
		query.setParameter("se",2451);
		
		
		Organization o=(Organization) query.getSingleResult();
		
		System.out.println(o);
		
		
		
	}

}
