package com.shivu.innerclass;

class Outer{
	int i;
  static class Inner{
		int j;
		void display(){
			System.out.println("j "+j);
		}
	}
	void display(){
		System.out.println("i "+i);
	}
}


public class StaticInnerclass {
	public static void main(String[] args) {
		Outer o=new Outer();
		o.i=100;
		o.display();
		
		Outer.Inner in=new Outer.Inner();
		in.j=1000;
		in.display();
	
	}
}
