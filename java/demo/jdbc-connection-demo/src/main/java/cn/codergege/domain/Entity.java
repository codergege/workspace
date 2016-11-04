package cn.codergege.domain;

public class Entity {
	private String nbxh;
	private String type;
	private String jgdm;
	private String uscc;
	
	public String getUscc() {
		return uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}
	public String getNbxh() {
		return nbxh;
	}
	public void setNbxh(String nbxh) {
		this.nbxh = nbxh;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getJgdm() {
		return jgdm;
	}
	public void setJgdm(String jgdm) {
		this.jgdm = jgdm;
	}
	@Override
	public String toString() {
		return "Entity [nbxh=" + nbxh + ", type=" + type + ", jgdm=" + jgdm + ", uscc=" + uscc + "]";
	}
	
}
