package com.common.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.common.entities.Organization;


public class GetData {
	
	public static List<Organization> getOrganization(){
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA_COMMON_ENTITIES");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createQuery("select o from Organization o");
		/*query.setFirstResult(20);
		query.setMaxResults(5);*/
		
		@SuppressWarnings("unchecked")
		List<Organization> orgList= (List<Organization>) query.getResultList();
		
		
		//System.out.println("List size"+orgList.size());
		
		/*for(Organization o:orgList){
			System.out.println(o);
			ORG_MAP.put(o.getId(), o);
		}
		System.out.println(ORG_MAP);
		System.out.println(ORG_MAP.get(2651));*/
		return orgList;
		
	
	}
	
	
	public static void main(String[] args) {
		
		Map<Integer,Organization> ORG_MAP=new LinkedHashMap<Integer, Organization>();
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA_COMMON_ENTITIES");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createQuery("select o from Organization o");
		query.setFirstResult(20);
		query.setMaxResults(5);
		
		@SuppressWarnings("unchecked")
		List<Organization> orgList= (List<Organization>) query.getResultList();
		
		
		System.out.println("List size"+orgList.size());
		
		for(Organization o:orgList){
			System.out.println(o);
			ORG_MAP.put(o.getId(), o);
		}
		System.out.println(ORG_MAP);
		System.out.println(ORG_MAP.get(2651));
		
	
	}
}
