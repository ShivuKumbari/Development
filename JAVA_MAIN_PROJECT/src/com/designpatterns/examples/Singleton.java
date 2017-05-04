package com.designpatterns.examples;

public class Singleton {
	
	private static Singleton obj;
	
	private Singleton(){
		
		if(obj!=null){
			throw new IllegalStateException("Already created");
		}
		
	}
	
	public static Singleton getInstance(){
		
		if(obj==null){
			obj=new  Singleton();
		}
		
		return obj;
	}
	
	void display(){
		System.out.println("I am in Singleton of :" + obj);
	}

}
