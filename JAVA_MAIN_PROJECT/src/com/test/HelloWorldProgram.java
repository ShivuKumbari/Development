package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class T{
	
	private void display(){
		System.out.println("I am in T");
	}
}

public class HelloWorldProgram {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		/* System.out.println(" I am Shivanand");
		 System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		 
		 System.out.println(Double.MIN_VALUE);
		 
		 System.out.println(Integer.MIN_VALUE);
		 System.out.println(Integer.MAX_VALUE);*/
		 
		 try
			{
				Class cls = Class.forName("com.test.T");
				Object obj = cls.newInstance();
				Method[] methods = cls.getDeclaredMethods();
					methods[0].setAccessible(true);
					methods[0].invoke(obj);
				
			}
			catch( Exception e )
			{
				e.printStackTrace();
			}
		 
	}
}
