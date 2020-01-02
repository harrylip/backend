package edu.swjtuhc.demo.model;

public class Opinion {
	private Integer oid;
	private String opinion;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	@Override
	public String toString() {
		return "Opinion [oid=" + oid + ", opinion=" + opinion + "]";
	}
	
	
}
