package com.reus.ssm.model;

import java.util.Date;

/**
 * 用户的持久类
 */
public class User {
	private int id; //编号
	private String username; //用户名
	private String gender; //性别
	private Date birthday; //生日
	private String address; //地址
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", username='" + username + '\'' +
			", gender='" + gender + '\'' +
			", birthday=" + birthday +
			", address='" + address + '\'' +
			'}';
	}
}
