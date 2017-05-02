package com.shivu.innerclass;

@FunctionalInterface
interface Test{
 void show();
}

public class AnonymousInnerclass{
public static void main(String[] args) {
	Test a= ()->System.out.println(" i am in Overriden class");
		
	
	a.show();
}
}
