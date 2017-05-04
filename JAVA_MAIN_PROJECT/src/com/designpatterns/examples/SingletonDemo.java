package com.designpatterns.examples;

import java.lang.reflect.Constructor;

public class SingletonDemo {
	
	public static void main(String[] args)  {
		
		Singleton s=Singleton.getInstance();
		s.display();
		
		try
		{
		Class cls = Class.forName("com.designpatterns.examples.Singleton");
		Constructor[] constructors = cls.getDeclaredConstructors();
		System.out.println("Constructor Name--->>>"+constructors[0].getName());
		constructors[0].setAccessible(true);
		System.out.println("Object creation--->>>"+constructors[0].newInstance( ));
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}
