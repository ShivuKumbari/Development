package com.shivu.serdezation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialiazationDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fin=new FileInputStream("Test.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Student s=(Student) oin.readObject();
		System.out.println(s);
	}

}
