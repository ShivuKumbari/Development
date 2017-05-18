package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("d");
		list.add("a");
		list.add("m");
		list.add("z");
		list.add("shivu");
		System.out.println(list);
		
		//Collections.sort(list,new Comparator<T>());
		
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				int i=o1.length();
				int j=o2.length();
				
				if(i>j){
					return -1;
				}
				else if(i<j){
					return 1;
				}
				else{
				
					return -o1.compareTo(o2);
				}
			}
		});
		
	/*	list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});*/
		
		System.out.println(list);
		Iterator itr=list.iterator();
		
		while(itr.hasNext()){
		
			System.out.println(itr.next());
			
			
			
			
		}
		
	}

}
