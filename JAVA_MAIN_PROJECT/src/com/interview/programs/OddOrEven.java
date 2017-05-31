package com.interview.programs;

import java.util.Scanner;

public class OddOrEven {
	static{
	
		System.out.println( " hello ");
	
	}
	
	public void main(){
		System.out.println("12123234");
	}
	public static void main(String args[]){
		
		OddOrEven obj = new OddOrEven();
		
		obj.main();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int n = sc.nextInt();
		
		System.out.println( n );
		
		if(n%2==0){
			System.out.println(" The number is even");
		}
		else{
			System.out.println(" The number is odd");
		}
		int count = 0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
			{
				count++;
				
			}
		}
		
		if(count ==0){
			System.out.println("The number is prime");
		}
		else{
			
		}
	}
}
