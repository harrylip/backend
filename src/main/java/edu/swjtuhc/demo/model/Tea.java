package edu.swjtuhc.demo.model;

public class Tea {
	private  Integer  Tid;
	private  String  name;
	private  String  picture;
	private  String  text;
	private  String  type;
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Tea [Tid=" + Tid + ", name=" + name + ", picture=" + picture + ", text=" + text + ", type=" + type
				+ "]";
	}
	
}
