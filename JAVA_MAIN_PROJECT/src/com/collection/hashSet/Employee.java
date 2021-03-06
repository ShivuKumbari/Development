package com.collection.hashSet;

public class Employee implements Comparable<java.lang.String> {
	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
