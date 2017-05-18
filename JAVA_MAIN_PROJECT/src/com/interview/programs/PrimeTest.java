package com.interview.programs;

public class PrimeTest {

	public static void main(String[] args) {
		
		int num= 7;
		
		
		if(isPrime(num)){
			System.out.println("Prime");
		}else{
			System.out.println("No Prime");
		}
		
	}
	public static boolean isPrime(int num){
		
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
}
