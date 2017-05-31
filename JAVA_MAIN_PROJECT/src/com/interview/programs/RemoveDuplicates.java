package com.interview.programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String args[]){
		
		int arr[] = {12,13,12,24,72,78,15,15,78};
		
		Set<Integer> newArr = new HashSet<Integer>();
		
		for(Integer x : arr){
			if(!newArr.contains(x)){
				newArr.add(x);
			}
		}
		
		for(Integer x : newArr){
			System.out.println(x);
		}
		
	}
		
}
