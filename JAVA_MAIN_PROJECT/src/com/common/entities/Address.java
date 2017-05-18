package com.common.entities;

public class Address {

	private String addline1;
	private String taluk;
	private String dist;
	private String state;
	private int pincode;
	public String getAddline1() {
		return addline1;
	}
	public void setAddline1(String addline1) {
		this.addline1 = addline1;
	}
	public String getTaluk() {
		return taluk;
	}
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addline1=" + addline1 + ", taluk=" + taluk + ", dist=" + dist + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	
	
	
}
