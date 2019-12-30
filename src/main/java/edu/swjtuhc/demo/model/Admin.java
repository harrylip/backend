package edu.swjtuhc.demo.model;

public class Admin {
	private int admin_ID;
	private String admin_name;
	private String admin_password;
	public int getAdmin_ID() {
		return admin_ID;
	}
	public void setAdmin_ID(int admin_ID) {
		this.admin_ID = admin_ID;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	@Override
	public String toString() {
		return "Admin [admin_ID=" + admin_ID + ", admin_name=" + admin_name + ", admin_password=" + admin_password
				+ "]";
	}
	
	
}
