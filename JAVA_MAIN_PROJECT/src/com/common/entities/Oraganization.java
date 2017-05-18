package com.common.entities;

/**
 * @author 847756
 *
 */
public class Oraganization implements Comparable<Oraganization> {
	
	private int id;
	private String name;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Oraganization(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Oraganization [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	@Override
	public int compareTo(Oraganization o) {
		int cur=this.id;
		int pas=o.getId();
		
		if(cur>pas){
			return 1;
		}
		else if(cur<pas){
			return -1;
		}
		else{
			return 0;
		}
		
		}
}
