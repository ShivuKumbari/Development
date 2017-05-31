package com.interview.programs;

public class StringImmutable {
	
	public static void main(String args[]){
		String s1 ="hello";
		 s1 ="223";
		String s2 = new String("hello");
		
		StringBuilder s3 = new StringBuilder("Ramya");
		System.out.println("s1"+ s1);
		System.out.println("S1 equals S2 "+s1.equals(s2));
		System.out.println("S1 == S2 "+ (s1 == s2));
		System.out.println("s2 "+ s2.concat("123"));
		System.out.println("s2"+ s2);
		System.out.println("s3"+ s3.append("123"));
		System.out.println("s3"+ s3);
	}

}
