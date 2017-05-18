package com.interview.programs;

public class StringExample {

	public static void main(String[] args) {
		String s1="SHIVU";
		String s2="SHIVU";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3=new String("SHIVU");
		String s4=new String("SHIVu");
		
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		
		System.out.println(reverse(s4));
		
		String s6=reverse(s4);
		
		
		
		if(s3.equals(s4)){
			System.out.println("Yes Pallindrosdafsadfm");
		}else{
			System.out.println("Not Pallindrom");
		}
		
		
		
	}
	
	
	static String reverse(String str){
		
		String res="";		
		
		for (int i=str.length()-1;i>=0;i--){

			System.out.println(str.charAt(i));
			
			res=res+str.charAt(i);
			
		}
		
		
		return res;
		
	}
	
}
