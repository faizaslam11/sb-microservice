package com.userservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class User {
	@Id
    private Long userId;
    private String userName;
	private int age;
	private String gender;
	private String password;
	public User() {
		
	}
	public User(Long userId, String userName, int age, String gender, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
