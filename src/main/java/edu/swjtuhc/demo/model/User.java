package edu.swjtuhc.demo.model;

public class User {
	private int UID;
	private String username;
	private String password;
	private String phonenumber;
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "User [UID=" + UID + ", username=" + username + ", password=" + password + ", phonenumber=" + phonenumber
				+ "]";
	}
	
}