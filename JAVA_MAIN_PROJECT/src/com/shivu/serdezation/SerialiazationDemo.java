package com.shivu.serdezation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialiazationDemo {
	public static void main(String[] args) throws IOException {
		test();
		
		
		
		
	}
	static void test() throws IOException{
		Student s=new Student(1000,"Shivu");
		FileOutputStream fout=new FileOutputStream("Test.txt");
		ObjectOutputStream oot=new ObjectOutputStream(fout);
		oot.writeObject(s);
		System.out.println("Done");
	}
}
