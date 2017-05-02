package com.shivu.innerclass;

class A{
	int i;
   class B{
		int j;
		void display(){
			System.out.println("j "+j);
		}
	}
	void display(){
		System.out.println("i "+i);
	}
}



public class MemberInnerclass {
	public static void main(String[] args) {
	
		A a=new A();
		a.i=10;
		a.display();
		
		A.B b=new A().new B();
		b.j=100;
		b.display();
		
		
}
}
