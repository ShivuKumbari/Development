package com.collection.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String args[]){
		
		Set<StringBuilder> setObj = new HashSet<StringBuilder>();
		
	//	Employee e1 = new Employee();
		
		Employee e1 = new Employee(33, "fsaf", "address");
		
		Employee e2 = new Employee(33, "fsaf", "address");
	
		System.out.println(e1.hashCode() +" dsfsdf" + e2.hashCode());
		
		setObj.add(new StringBuilder("10"));
		
		setObj.add(new StringBuilder("10"));
		
		System.out.println(setObj.size());

	}
}
