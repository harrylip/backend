package edu.swjtuhc.demo.model;

import java.util.Date;

public class Orders {
	private  int OrderId;
	private String gid;
	private String goods;
	private String price;
	private String address;
	private String username;
	private Date buytime;
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBuytime() {
		return buytime;
	}
	public void setBuytime(Date buytime) {
		this.buytime = buytime;
	}
	@Override
	public String toString() {
		return "Orders [OrderId=" + OrderId + ", gid=" + gid + ", goods=" + goods + ", price=" + price + ", address="
				+ address + ", username=" + username + ", buytime=" + buytime + "]";
	}
	
	
}
