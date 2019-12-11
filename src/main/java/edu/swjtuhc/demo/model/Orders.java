package edu.swjtuhc.demo.model;
public class Orders {
	String gid;
	String address;
	String ordername;
	String buytime;
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrdername() {
		return ordername;
	}
	@Override
	public String toString() {
		return "Orders [gid=" + gid + ", address=" + address + ", ordername=" + ordername + ", buytime=" + buytime
				+ "]";
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getBuytime() {
		return buytime;
	}
	public void setBuytime(String buytime) {
		this.buytime = buytime;
	}
	
}
