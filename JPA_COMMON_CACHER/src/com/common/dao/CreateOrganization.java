package com.common.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.common.entities.Organization;

public class CreateOrganization {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		
		
		Organization organization=new Organization();
		organization.setName("TCS");
		organization.setAddress("Bengaluru");
		
		manager.persist(organization);
		manager.getTransaction().commit();
		
		manager.close();
		//manager.flush();
		factory.close();
		
		
		EntityManagerFactory factory1=Persistence.createEntityManagerFactory("JPA_COMMON_ENTITIES");
		EntityManager manager1=factory1.createEntityManager();
		manager1.getTransaction().begin();
		
		
		
		Organization organization1=new Organization();
		organization1.setName("TCS");
		organization1.setAddress("Bengaluru");
		
		manager1.persist(organization1);
		manager1.getTransaction().commit();
		
		manager1.close();
		factory1.close();
		
		/*EntityManagerFactory factory2=Persistence.createEntityManagerFactory("JPA_COMMON_ENTITIES");
		EntityManager manager2=factory2.createEntityManager();
		manager2.getTransaction().begin();
		
		Organization o=manager2.find(Organization.class, 3101);
		System.out.println("Before");
		System.out.println("The Result is " +o);
		o.setName("ORACLE");
		
		
		manager2.persist(o);
		System.out.println("Before");
		System.out.println("The Result is " +o);
		manager2.getTransaction().commit();
		System.out.println("Afetr");
		System.out.println("The Result is " +o);
		manager2.close();
		factory2.close();*/
		
		
		EntityManagerFactory factor3=Persistence.createEntityManagerFactory("JPA_COMMON_ENTITIES");
		EntityManager manager3=factor3.createEntityManager();
		
		manager3.getTransaction().begin();
		Organization o1=manager3.find(Organization.class, 4151);
		
		System.out.println("Before Removeing Object");
		System.out.println(o1);
		
		manager3.remove(o1);
		
		System.out.println("After Removing Object");
		System.out.println(o1);
		//manager3.persist(o1);
		manager3.getTransaction().commit();
		
		System.out.println("After Remove Comitted");
		System.out.println(o1);
		
		manager3.close();
		factor3.close();
		
	}

}
