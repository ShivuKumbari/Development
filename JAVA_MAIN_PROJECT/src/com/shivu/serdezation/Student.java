package com.shivu.serdezation;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int id;
	
	private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int a,String n){
		this.id=a;
		this.name=n;
	}

}
