package com.example.demo.entity;

public class User {
	private int id;
	private String username;
	private String password;
	private String yours;
	private String gender;
	private String birth;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getYours() {
		return yours;
	}
	public void setYours(String yours) {
		this.yours = yours;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", yours=" + yours + ", gender="
				+ gender + ", birth=" + birth + "]";
	}
	public void setId(int id) {
		this.id = id;
	}

}
