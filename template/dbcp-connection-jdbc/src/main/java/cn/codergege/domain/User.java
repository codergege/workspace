package cn.codergege.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	private static final long serialVersionUID = 453177140160585720L;
	
	private int id;
	private String name;
	private int gender;
	public User(String name, int gender, Date birthday) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
	}
	private Date birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
