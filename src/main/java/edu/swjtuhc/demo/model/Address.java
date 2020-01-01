package edu.swjtuhc.demo.model;

public class Address {
	private int a_id;
	private String username;
	private String address;
	private String phonenumber;
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Address [a_id=" + a_id + ", username=" + username + ", address=" + address + ", phonenumber="
				+ phonenumber + "]";
	}
	
}
